package dktlamp;

import java.time.LocalDateTime;
import java.util.StringJoiner;

/**
 * 전원 끄기 예약이 가능한 책상 조명
 */
public class MyTimerDeskLamp extends DeskLamp {

    final static int DELAY_MILLISECOND = 5000;

    private Thread offDelayThread; // 전원 끄기 예약 쓰레드
    
    // TODO - TimerDeskLamp 클래스의 나머지 코드를 구현해 주세요.

    // 전원 끄기 예약 메소드
    private void turnOffSchedule() {
    	//쓰레드 생성자 
    	offDelayThread = new Thread(new Thread());
    	//쓰레드 실행
    	offDelayThread.start();
    	
    	System.out.println("5초 후에 전원이 꺼집니다.");
    	try {Thread.sleep(DELAY_MILLISECOND);} catch (InterruptedException e) {;}
    	
    	
    }
    
    
    @Override
    public void turnOff() {
    	turnOffSchedule();
    
    	super.turnOff();
    }
    
}
