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

I checked every element in the previously sorted list with each other for the sum of 13. If the sum is more than 13, 2nd
cycle iteration will be broken because all numbers to the right are bigger than the current one for sure.

# Task 3

You should run src/main/java/tasks/Task3.main() method to start the application for the first task. The first line of
input contains a positive number *n*, and the next *n* lines contain pairs of positive integers, where each pair
identifies a connection between two vertices in a graph. As output, you will get a number of separate graphs from the
input.

I put a set of vertices into the list and iterate through the input vertices pairs, checking if I have such vertice in
the already existing graph. If both of the vertices are occurs into separate graphs they'll be joined into one. If
vertice occurs in the one graph, it'll be extended with one new occurs. If vertices are not in any existing graphs, a
new graph will be added to the set.
