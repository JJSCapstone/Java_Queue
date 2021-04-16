package edu.Shepherd.Queue;
public class Queue<E> {
    Node<E> head;   
    public class Node<F>{
        F data;
        Node<F> link;
        public Node(F data){
            this.data = data;
            link = null;
            }
        }  
        public Queue(){
            head=null;
        }
        public void insert(E data){
            if(head==null){
<<<<<<< HEAD
                head= new Node(data);
=======
                head= new Node<E>(data);
>>>>>>> 83445fdb6d1aef01ae57987e5f80ac6a24906d8f
            }  else {
                Node<E> current =head;
                while (current.link!=null){
                    current = current.link;
                }
<<<<<<< HEAD
                current.link =new Node(data);
            }
        }
        public E pop(){
            Node<E> target = head;
            head= head.link;
            return target.data;
=======
                current.link =new Node<E>(data);
            }
        }
        public Node<E> pop(){
            Node<E> target = head;
            head= head.link;
            return target;
>>>>>>> 83445fdb6d1aef01ae57987e5f80ac6a24906d8f
        }

        public int size(){
            int size =0;
            Node<E> current =head;
            while (current!=null){
                size++;
                current= current.link;
            }
            return size;
        }

        public boolean isEmpty(){
            if (head ==null){
                return true;
            }
            return false; 
        }

<<<<<<< HEAD
        public E peek(){
            return head.data;
=======
        public Node<E> peek(){
            return head;
>>>>>>> 83445fdb6d1aef01ae57987e5f80ac6a24906d8f
        }

    }
