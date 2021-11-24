public class Node<T>
{

    //variables
    T data;
    Node<T> next;


    public Node(T s)
    {
        //set the data to be what was passed in
        data = s;

        //set the next to be null - there is nothing after
        next = null;

    }

}
