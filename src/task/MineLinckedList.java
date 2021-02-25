package task;

public class MineLinckedList {

    NodeList begining;

    public class NodeList {

        int data;
        NodeList next;

        public NodeList(int number) {
            this.data = number;
            this.next = null;

        }
    }

    public void addToEnd(int number) {
        // new Node object
        NodeList node = new NodeList(number);

        //checks is starting point has any Node asigned to it
        //if not adds newly created object
        if (begining == null) {
            begining = node;
        } //if at lease one Node is created -> adds to the end new Node
        else {
            // new Node object that will be looped through to find he last element
            //in "array".
            NodeList looping = begining;
            while (looping.next != null) {
                looping = looping.next;
            }
            // Adds to the last element a reference of a new Node
            looping.next = node;
        }
    }

    public void getArray() {
        //first Node 
        NodeList looping = begining;
        //printing all Nodes till the last Node
        while (looping.next != null) {
            System.out.print(looping.data + ", ");
            looping = looping.next;
        }
        //printing last Node
        System.out.println(looping.data);
    }

    public void addToBegining(int number) {
        // new Node
        NodeList node = new NodeList(number);
        //checks is starting point has any Node asigned to it
        //if not adds newly created object
        if (begining == null) {
            begining = node;
        } //if at lease one Node is created 
        //creates new Node object to hold current first Node object
        //assigns to the begining new Node and reference to next Node
        else {
            NodeList temp = begining;
            begining = node;
            node.next = temp;
        }
    }

    public void addAt(int index, int number) {
        //new Node
        NodeList node = new NodeList(number);
        // fisrt Node
        NodeList looping = begining;
        int i = 0;
        for (; i < index - 1;) {
            looping = looping.next;
            i++;
        }
        //adds object to the index
        node.next = looping.next;
        looping.next = node;
    }

    public void get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (this.begining == null) {
            throw new IndexOutOfBoundsException();
        }
        NodeList looping = begining;
        int i = 0;
        //looping till the point when Node becomes needed index element  
        for (; i < index; i++) {
            looping = looping.next;
        }
        if (i < index) {
            throw new IndexOutOfBoundsException();
        }
        System.out.println(looping.data);
    }

    public int length() {
        //if there is no Node created return 0
        if (this.begining == null) {
            return 0;
        }
        NodeList looping = begining;
        int length = 0;
        while (looping != null) {
            length++;
            looping = looping.next;
        }
        return length;
    }

    public void set(int index, int number) {
        //checks if the value positive, otherwise throws exception
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        //checks is any element was created, otherwise throws exception
        if (this.begining == null) {
            throw new IndexOutOfBoundsException();
        }
        NodeList looping = this.begining;
        int count = 0;
        //looping to get element bu index
        while (count < index && looping.next != null) {
            looping = looping.next;
            count++;
        }
        if (count < index) {
            throw new IndexOutOfBoundsException();
        }
        //setting new value
        looping.data = number;
    }

    public void remove(int index) {
        //checks if the value positive, otherwise throws exception
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        //checks is any element was created, otherwise throws exception
        if (this.begining == null) {
            throw new IndexOutOfBoundsException();
        }
        NodeList looping = this.begining;
        //if index 0 removing first Node
        if (index == 0) {
            looping = looping.next;
        } //otherwise creating two loops
        else {
            int count = 1;
            while (count < index && looping.next != null) {
                //looping to get element that stends before Node that should be removed 
                looping = looping.next;
                count++;
            }
            if (count < index || looping.next == null) {
                throw new IndexOutOfBoundsException();
            }
            //skipping one node
            looping.next = looping.next.next;
        }
    }

    public String toString() {
        String array = "[ ";
        NodeList looping = this.begining;
        System.out.println(looping);
        while (looping != null) {
            array += looping.data;
            looping = looping.next;
            if (looping != null) {
                array += ", ";
            }

        }
        array += " ]";

//        int length = this.length();
//        // creates new Node object to be looped through while the loop doesnt reach the last object
//        NodeList looping = begining;
//        String array = "[ ";
//        for (int i = 0; i < length; i++) {
//            if(looping.next == null){
//           array += looping.data + "  ]";
//            }
//            array += looping.data + ", ";
//            looping = looping.next;
//        }
        return array;
    }
}
