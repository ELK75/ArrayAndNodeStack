#!/bin/bash
compile="javac -cp 'hamcrest-core-1.3.jar;.;junit-4.12.jar' StackTest.java Stack.java ArrayStack.java LinkedStack.java"
eval $compile
run="java -cp 'junit-4.12.jar;.;hamcrest-core-1.3.jar' org.junit.runner.JUnitCore StackTest"
eval $run