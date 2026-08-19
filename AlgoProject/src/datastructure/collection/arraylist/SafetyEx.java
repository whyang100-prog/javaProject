package datastructure.collection.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SafetyEx {

    public static void main(String[] args) throws InterruptedException{
        // ArrayList에 값을 insert작업을 스레드를 이용해서 병렬로 동시에 진행
        // 목표 : 1000개의 값을 arrayList에 스레드 이용 동시 저장
        List<Integer> list = new ArrayList();
        int threadCount = 1000;

        /*
         
스레드 풀 생성(32개의 thread를 미리 생성)
스레드를 요청하면 할당 전 thread를 할당 -> 바로 작업
스레드 풀에 할당 thread가 없으면 대기
32개의 thread를 미리 만들어 놓고 작업이 들어오면 할당
 
*/

ExecutorService executorService = Executors.newFixedThreadPool(32); 
/*
executorService.submit()
스레드 풀에 작업 task 함수를 전달하고
작업 진행상테 추적 제어 가능한
*/
for(int i=0; i<threadCount; i++) {
    final int value = i; //i값이 arrayList에 저장됨
    executorService.submit(() ->{
    	list.add(value);
    });
    }

    /*
    여러개의 thread가 동시에 한 index 참조할 때 쓰기연산 진행하면 시간차로 인해
    먼저 쓴 내용 다음 thread에 의해 지워질 수 있음 -> 동시성 문제
     */
    executorService.shutdown();//새로운 작업 제출을 스레드 풀이 거무하고 기존 작업은 모두 마치고 스레드 풀 종료
    executorService.awaitTermination(5,TimeUnit.SECONDS);
   
    //결과출력
    System.out.println("목표 크기: "+threadCount);
    System.out.println("실제 리스트 크기:" +list.size());
    
    //ArrayList는 thread 환경에서는 안전하지 못함
}
}