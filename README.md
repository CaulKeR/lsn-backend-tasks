# Task 1

You should run src/main/java/tasks/Task1.main() method to start the application for the first task. The input format is
the list of integers separated with a space symbol in one line. For example: *'1 10 20 20 2 5'*. As output, you will see
the list of distinct elements sorted in ascending order, the number of elements in the source list, the number of
distinct elements and min and max values.

I used TreeSet to easily get a distinct ordered 'list' of integers and methods Collection.size(), SortedSet.first(),
SortedSet.last() to get measurement information.

# Task 2

You should run src/main/java/tasks/Task2.main() method to start the application for the second task. The input format is
the list of integers separated with a space symbol in one line. For example: *'1 2 10 7 5 3 6 6 13 0'*. As output, you
will see the pairs that sum up to 13. Each pair in the output will have a first number not greater than the second one,
and lines will be sorted in ascending order.

I iterated through the input list and put result of subtraction of the current element from 13 into the set. If the
result is already in the set, I add a pair of numbers into the output list. At the end I sort the output list and print
it.

# Task 3

You should run src/main/java/tasks/Task3.main() method to start the application for the first task. The first line of
input contains a positive number *n*, and the next *n* lines contain pairs of positive integers, where each pair
identifies a connection between two vertices in a graph. As output, you will get a number of separate graphs from the
input.

I put all vertices into the map as keys and all connections as values. Then I iterated through the map and for each
vertex I checked if it is already in the set of visited vertices. If not, I added it to the stack and iterated through
the stack until it is empty. For each vertex in the stack I added all its connections to the stack and marked the vertex
as visited. At the end I got the number of separate graphs.
