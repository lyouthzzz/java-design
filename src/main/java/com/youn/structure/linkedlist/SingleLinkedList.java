package com.youn.structure.linkedlist;

/**
 * Author:youn
 * Date: 2018/12/02
 * Desc: 单链表实现 1.优点:插入删除复杂度O(1) 查找复杂度O(n)
 */

public class SingleLinkedList<E> {

    private Node head = null;

    public SingleLinkedList() {
    }

    /**
     * 获取链表对应index的值
     *
     * @param index
     * @return
     */
    public E get(int index) {
        Node q = head;
        int pos = 0;
        while (q != null) {
            if (pos++ == index) {
                return q.data;
            }
            q = q.next;
        }
        return null;
    }

    /**
     * 插入值到链表头部
     *
     * @param value
     */
    public void insertToHead(E value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * 插入值到链表尾部
     *
     * @param value
     */
    public void insertToTail(E value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
        } else {
            Node q = head;
            while (q.next != null) {
                q = q.next;
            }
            newNode.next = q.next;
            q.next = newNode;
        }
    }

    /**
     * 删除链表值为value的元素
     *
     * @param value
     */
    public void delete(E value) {
        if (head == null) return;
        Node p = head;
        Node q = null;
        while (p != null && !p.data.equals(value)) {
            q = p;
            p = p.next;
        }

        if (p == null) {
            return;
        }
        if (q == null) {
            head = head.next;
        } else {
            q.next = p.next;
        }

    }

    /**
     * public void delete(Node node) {
     * if (node == null || head == null) return;
     * if (head == node) {
     * head = head.next;
     * }
     * Node q = head;
     * while (q != null && q.next != node) {
     * q = q.next;
     * }
     * if (q == null) {
     * return;
     * }
     * q.next = q.next.next;
     * }
     **/

    /*
    打印对象
     */
    public String print() {
        Node q = head;
        StringBuilder builder = new StringBuilder();
        while (q != null) {
            builder.append(q.data.toString());
            builder.append(" ");
            q = q.next;
        }
        return builder.toString();
    }

    public class Node {
        private E data;
        private Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public E data() {
            return data;
        }

        public Node next() {
            return next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.insertToTail("three");
        System.out.println(linkedList.get(1));
    }
}
