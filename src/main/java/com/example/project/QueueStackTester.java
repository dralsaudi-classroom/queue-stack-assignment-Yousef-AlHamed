package com.example.project;

public class QueueStackTester {
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
       for (int counter = 1; counter <= q.length(); counter++) {
    	   T x = q.serve();
    	   q.enqueue(x);
    	   
    	   if (counter % 2 == 1) {
    		   oq.enqueue(x);
    	   } else {
    		   eq.enqueue(x);
    	   }
       };
       
    }
    public static <T> void remove(LinkedPQ<T> pq, int p)
    {
    	for (int i = 0; i < pq.length(); i++) {
    		PQElement<T> x = pq.serve();
    		if (x.p >= p)
    			pq.enqueue(x.data, x.p);
    	}
    }
    public static <T> boolean search(Stack<T> st, T e)
    {
			if (st.empty())
				return false;
			T x = st.pop();
			boolean flag = QueueStackTester.search(st, e);
			if (x.equals(e))
				flag = true;
			st.push(x);
			return flag;
    }
}