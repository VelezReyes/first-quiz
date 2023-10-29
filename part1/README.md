```
     _______         __        _______    ___________         ____    
    |   __ "\       /""\      /"      \  ("     _   ")       /  " \   
    (. |__) :)     /    \    |:        |  )__/  \\__/       /__|| |   
    |:  ____/     /' /\  \   |_____/   )     \\_ /             |: |   
    (|  /        //  __'  \   //      /      |.  |            _\  |   
   /|__/ \      /   /  \\  \ |:  __   \      \:  |           /" \_|\  
  (_______)    (___/    \___)|__|  \___)      \__|          (_______) 
```

Part 1 is a set of 5 Python questions.
You will need to have Python3.6 or better installed on your computer.

# Getting Started 

To get started run the below commands. They will create a new Python3 virtual environment, activate it, and 
install the pytest testing library.

```
python3 -m venv venv
source venv/bin/activate 
pip install pytest
```

*If you ever need to close your terminal and come back later:* You can enter the virtual environment from the same
directory by typing `source venv/bin/activate`.

# How to Work on the Questions

Each question is a unique challenge. 
- Question 1 is about solving a bug in an existing tiny program.
- Question 2 is about writing a simple function.
- Question 3 is about implementing a class to create a magical oven.
- Question 4 is will test your data and SQL abilities.
- Question 5 is about changing the tables you worked with in Question 4.   

Each question is in a file named something like, for example, `question3.py`. Every question also has VERY useful
test cases in files like, for example, `question3_test.py`.  The specific instructions for how to solve the question 
are in the file. 

You can test if your solution is correct by running `pytest` against the test file. For example:
```
pytest question3_test.py
```

If the test file passes then you have succeeded. This is how you will be graded.
It is highly recommended that you read the test file to know the expected output of your questions! 
You can learn more about how pytest works here: https://docs.pytest.org/en/7.4.x/contents.html