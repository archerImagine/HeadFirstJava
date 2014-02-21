Head First Java Chapter 11
=
This is the eleventh Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, 
This markdown file is my notes for the eleventh chapter, not sure if any copyright issues are there.

BULLET POINTS
-
* A method can throw an exception when something fails at runtime.
* An exception is always an object of type Exception.
* The compiler does NOT pay attention to exceptions that are of type **RuntimeException**. A RuntimeException does not have to be declared or wrapped in a try/catch.
* All Exceptions the compiler cares about are called **checked exceptions** which really means compiler-checked exceptions.
* A method throws an exception with the keywords **throw**, followed by a new exception object.

````java
throw new NoCaffeineException();

````

* Methods that might throw a checked exception must announce it with a throws Exception declarations.
* If your code calls a checked-exception-throwing method, it must reassure the compiler that precautions have been taken.
* If you're prepared to handle the exception, wrap the call in a try/catch, and put your exception handling/recovery code in the catch block.
* If you're not prepared to handle the exception, you can still make the compiler happy by officially 'ducking' the exception.

### Flow Control in try/catch block.
Take the example of the below code.

````java
try{
	Foo f = x.doRiskyThing();
	int b = f.getNum();
}catch (Exception e){
	System.out.println("Failed.");
}
System.out.println("We made it.");
````
If the try SUCCEEDS, the Catch block is not executed, and Last Sysout is printed.
If the Try fails, the rest of the try block never runs, and both the Sysout is printed.

### Finally
A finally block is where you put code that must run regardless of an exception.

````java
try{
	turnOvenOn();
	x.bake();
}catch (BakingException ex){
	ex.printStacktrace();
}finally{
	turnOvenOff();
}
````
A finally block lets you put all your import cleanup code in one place instead of duplicating it.
If the try or catch block has a return statement, finally will still run.

### Multiple Exception.
If a code throws multiple exceptions. 
* The catch block should be stacked one after the other. And the order of stacking is also important.
* Exceptions can be referred to polymorphically.
* You don't have to write a catch for each possible exception as long as the catch you have can handle any exception thrown.
 1. You can declare exceptions using a supertype of the exception you throw.
 2. You can CATCH exceptions using a super type of the exception thrown.
 3. Just because you CAN catch everything with one big super polymorphic catch, doesn't mean always you should.
* Multiple Catch block must be ordered from smallest to biggest.
* You can't put bigger baskets above smaller baskets.
* Siblings can be in any order, because they can't catch one another's exceptions.
* If you don't want to handle the exception in you code, declare the same exception in you code this is called DUCKING.

### Exception Rules
* You cannot have a catch or finally without a try.

The below code is not legal.
````java
	void go(){
		Foo f = new Foo();
		f.foof();
		catch (FooException ex){}
	}
````
* You cannot put code between the try and the catch.

The below code is not legal.
````java
try{
	x.doStuff();
}
int y = 43;
} catch (Exception ex){}
````
* A try MUST be followed by either a catch or finally.

The below code is legal.
````java
try{
	x.doStuff();
}finally{
	//CleanUp.
}
```` 

* A try with only a finally(no catch) must still declare the exception.

````java
void go() throws FooException{
	try{
		x.doStuff();
	}finally{}
}
````

