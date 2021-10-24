package com.khaidx2008110188.tuan7;
public class LinkedList {
    Node head = null;
    Node tail = null;
    Scanner nhap = new Scanner(System.in);
    // int data;
    // Node n = new Node(data);

    public LinkedList(){}

    void addTail(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    void addHead(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    void inDanhSach(){
        Node current = head;

        if(head == null){
            System.out.println("Danh Sach Rong");
        }else{
            System.out.println("Danh Sach Cac Bien: ");
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
    void add(int data, int n){
        Node current = head;
        if(head.data == n){
            addHead(data);
            return;
        }
        while(current.next != null){
            if(current.next.data == n){
                Node t = new Node(data);
                t.next = current.next;
                current.next = t;
                return;
            }
            current = current.next;
        }   
    }
    void removeHead(){
        Node tam = head;
        if(head == null){
            System.out.println("Danh Sach Rong");
            return;
        }
            head = tam.next;
    }
    void removeTail(){
        Node tam = head;
        if(head == null){
            System.out.println("Danh Sach Rong");
            return;
        }
        while(tam != null){
            if(tam.next == tail){
                tail = tam;
                tail.next = null;
                return;
            }
            tam = tam.next;
        }
    }
    void remove(int n){
        Node tam1 = head;
        Node tam2 = null;
        if(tam1 != null && tam1.data == n){
            removeHead();
            return;
        }
        if(tam1 != null && tail.data == n){
            removeTail();
            return;
        }
        while(tam1 != null){
            tam2 = tam1;
            tam1 = tam1.next;
            if(tam1.data == n){
                tam2.next = tam1.next;
                return;
            }
        }
    }
    void edit(int n, int t){
        Node current = head;
        while(current != null){
            if(current.data == n)
                current.data = t;
            current = current.next;
        }
    }
}