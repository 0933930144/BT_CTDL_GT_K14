package com.khaidx2008110188.tuan8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args) {
        Queue<Integer> queue;
        queue = new LinkedList<>();
        queue.add(8);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        // lấy ra 1 phần tử trong quee - lấy đầu
        System.out.println(queue);
        int phanTuDuocLayRa = queue.remove();
        System.out.println("Phần tử được lấy ra từ Queue:\n" + phanTuDuocLayRa);

        System.out.println("Phần tử còn lại trong Queue:\n");

        System.out.println(queue);

        // thăm 1 phần tử của Queue = không loại khỏi queue
        int phanDuocTham = queue.remove();
        System.out.println("Phan tu vua duoc tham:\n" + phanDuocTham);
        System.out.println("Phần tử còn lại trong queue sau thăm:\n");
        System.out.println(queue);
    }

}