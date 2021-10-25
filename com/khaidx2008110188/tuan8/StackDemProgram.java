package com.khaidx2008110188.tuan8;

import java.util.Stack;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class StackDemProgram {
    public static void main(String[] args) {
        Stack<String> stack;

        stack = new Stack<>();

        // thêm 1 phần tử vào Stack
        stack.push("Welcome");
        stack.push("to");
        stack.push("Data Structure and Algotithm");

        System.out.println(stack);
        // lấy ra 1 phần tử từ đỉnh stack(Xoá phần tử từ stack)
        String poped = stack.pop();
        System.out.println("Da lay ra tu stack:\n" + poped);
        System.out.println("Phan tu con lai cua stack");
        System.out.println(stack);
        // Thăm nút đỉnh // loại ra khỏi danh sách
        String phantuduocTham = stack.peek();
        System.out.println("Tham phan tu dinh:" + phantuduocTham);
        // sau khi thăm
        System.out.println(stack);
        Stack<String> stack2;
    }
}
