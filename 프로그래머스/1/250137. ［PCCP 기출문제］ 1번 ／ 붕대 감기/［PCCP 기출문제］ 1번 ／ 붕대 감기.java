class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // t초 동안 붕대를 감으면서
        // 1초마다 x만큼의 체력을 회복한다.
        // t초 연속으로 붕대를 감는 데 성공한다면 y만큼의 체력을 추가로 회복한다.
        // 최대 체력보다 커지는 것은 불가능하다.
        
        // 기술을 쓰는 도중 공격 당하면 기술 취소
        // 공격 당하는 순간에는 체력 회복 x
        // 기술 취소 or 기술 끝 -> 즉시 붕대 감기, 연속 성공 시간=0
        
        // 몬스터의 공격을 받으면 정해진 피해량 만큼 현재 체력 줄어듬
        // 이때 체력 0이하가 되면 캐릭 죽음
        
        // 붕대감기(bandage):{기술의 시전 시간, 1초당 회복량, 추가 회복량}
        // 최대체력(health)
        // 몬스터의 공격시간과 피해량(attacks):{{공격시간,피해량},{공격시간,피해량},{공격시간,피해량}'''}
        
        // 모든 공격이 끝난 직후 남은 체력을 return
        // 만약 죽었다면 -1 return
        
        
        int answer = health;
        int attackOrder = 0;
        int[] attack = attacks[0];
        int healthCon = 0;
        
        // 마지막 공격의 공격시간만큼 반복
        for(int i=0; i<=attacks[attacks.length-1][0]; i++){
            // i -> 현재 시간
            
            // attack -> 현재 공격
            // 현재 공격받는 시간이 되었다면
            if(attack[0]==i){
                // 공격 피해량 만큼 체력이 깎인다.
                answer -= attack[1];
                // 캐릭 죽음
                if(answer<=0){
                    return -1;
                }
                // attack을 다음 공격으로 바꿔준다.
                if(attackOrder!=attacks.length-1){
                    attack = attacks[++attackOrder];
                }
                // 공격받으면 회복 지속시간을 0으로 바꾼다.
                healthCon=0;
            } else {// 현재 공격받고 있지 않다면
                
                // 최대체력보다 많거나 같으면 다음 반복문으로 넘어간다.
                if(answer>=health){
                    //체력이 최대체력보다 많아지면 최대체력으로 할당해주고 회복 메서드는 넘어간다.
                    answer=health;
                    continue;
                }
                
                // 초당 회복량을 회복한다.
                answer+=bandage[1];
                // 회복 지속시간을 늘린다.
                // 회복 지속시간이 시전 시간이랑 같아지면
                if(++healthCon==bandage[0]){
                    // 추가 회복량을 회복한다.
                    answer+=bandage[2];
                    healthCon=0;
                }
            }
            // System.out.println(i);
            // System.out.println(answer);
        }
        return answer;
    }
}