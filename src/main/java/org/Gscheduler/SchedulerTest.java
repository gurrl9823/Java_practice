package org.Gscheduler;

import java.io.IOException;

public class SchedulerTest {

    public static void main(String[] args) throws IOException {

        System.out.println("전화 상담 배분방식을 선택하세요 R, L, P");

        int ch = System.in.read();
        Scheduler scheduler = null;

        // 상황에 따라 다른 인스턴스를 할당한다.
        // 하지만 3가지 모두 같은 interface를 implement 받았기 때문에
        // 메소드명은 같다.
        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        }
        else {
            System.out.println("지원하지 않는 기능입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();

    }

}
