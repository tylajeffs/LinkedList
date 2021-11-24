public class LinkedList<T>
{
    //fields
    Node<T> head;
    int size;



    /**
     * constructor, intializes stuff
     */
    public LinkedList()
    {
        //list starts out empty
        head = null;
        size = 0;

    }


    /**
     * method to add a node to the list
     */
    public void addNode(T d)
    {
        //create the new node
        Node<T> newNode = new Node<T>(d);

        //check to see if the list is empty or not
        if(head == null)
        {
            //set the head to be the new node
            head = newNode;
        }
        else
        {
            //helper variable to keep track of where we are in the list
            Node<T> current = head;

            //go through the list until you get to the end
            while(current.next != null)
            {
                current = current.next;
            }

            //now current is the last node in the list, so add the new node to the end
            current.next = newNode;

        }

        //increase the size of the list
        size++;

    }


    /**
     * helper method to print all the nodes in the list
     */
    public void printAllNodes()
    {
        Node<T> current = head;

        //loop through list and print each node
        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }

    }


    /**
     * getter method for size
     * @return size of linked list
     */
    public int size()
    {
        return size;
    }





    /**
     * get method that returns the data at a specified index
     * @param index
     * @return string of data in the node at specified index
     */
    public T get(int index)
    {
        Node<T> current = head;

        //loop through the list until it gets to the right index
        for(int i = 0; i < index; i++)
        {
            current = current.next;
        }

        //return the data at the node at the index
        return current.data;
    }




    /**
     * helper method to remove a node at a specified index from the linked list
     *
     * @param index index of node to remove
     * @return the data inside the node that was removed
     */
    public T removeAt(int index)
    {
        //the string to return at the end
        T toReturn = null;

        Node<T> current = head;

        //check to see if index is 0
        if(index == 0)
        {
            //if it is 0, we need to use the head for the data
            toReturn = head.data;
            head = head.next;
        }
        else
        {
            //loop through the list to get to the specified index
            for(int i = 0; i < index-1; i++)
            {
                //update current
                current = current.next;

            }

            //toReturn is now the data from the next node
            toReturn = current.next.data;

            //update the next of the current to be the one after we want to remove
            current.next = current.next.next;
        }



        //linked list size is now 1 less
        size--;

        return toReturn;

    }





    /**
     * method to insert a node at an index in a linked list
     * and shift all the other nodes down
     * @param index index to insert the node at
     * @param d data inside the new node
     */
    public void insertAt(int index, T d)
    {
        //create the new node
        Node<T> newNode = new Node<T>(d);

        //reference to current node
        Node<T> current = head;

        //increase the size
        size++;

        //check to see if we are inserting at the head
        if(index == 0)
        {
            //push the head back to be the next node
            newNode.next = head;

            //new node becomes the head
            head = newNode;
        }
        else
        {
            //go through the list and find the correct place to insert
            for(int i = 0; i < index-1; i++)
            {
                current = current.next;
            }

            //set the new node's next pointer to be the pointer of the current next
            newNode.next = current.next;

            //set the current's pointer to the new node we are inserting
            current.next = newNode;
        }

    }





}

