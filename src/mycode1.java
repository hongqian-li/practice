//①Hello world学习
//public class mycode1 {
//
//	public static void main(String[] args) {
//		System.out.println("I am Lucas");
//		System.out.println("What do you mean?");
//
//	}
//}

//②变量的本质学习
//public class mycode1 {
//
//	public static void main(String[] args) {
//		
//		int age = 18;
//		int b; //只是声明了变量b，没有初始化；
//		int x=0, y=0, z=1;
//		System.out.println(age);
//		b = 0;//变量使用之前必须初始化！
//		System.out.println(b);
//		System.out.println(z);
//	}
//}

//③不同变量种类的学习
//public class mycode1 {
///**	
//	int a = 3; //Instance Variables成员变量 属于对象，首字母小写和驼峰原则，monthSalary
//	static int b = 4; //Class Variables静态变量 属于类
//*/			
//			
//	public static void main(String[]args) {
//		//Local variables局部变量 属于方法/语句块，首字母小写和驼峰原则
//		int age = 18;
//		int b = 0;
//		int c = 19;
//		
//		System.out.println(age);
//		System.out.println(c);
//		System.out.println(age + c);
//		
//	}
//}

//Class类名，首字母大写和驼峰原则: Man， GoodMan或者goodMan。
//方法名，首字母小写和驼峰原则：run()，runRun()


//④Constant 常量学习 
//永恒且不变的，关键词为final，全部大写字母和下划线区分。
//
//public class mycode1 {
//	
//	public static void main(String[] args) {
//		final double PI = 3.14;
//		//PI = 3.1415; //无法为常量再次分配值
//		double r = 4;
//		double area = PI * r * r;
//		double circle = 2 * PI * r;
//		System.out.println("area = " + area);
//		System.out.println("circle = " + circle);
//		
//	}
//}


////⑤基本数据类型 primitive data type有八种：
//1.数值型：
//1.1整数类型：byte 1个字节,short 2个字节,int 4个字节,long 8个字节。
//1.2浮点型：float 4个字节,double 8个字节。
//注意：1个字节byte，等于8位比特bit，可以表示为2的8次方，即256个状态。
//2.字符型：char, 
//3.布尔型: boolean
//
////引用数据类型 为4个字节
//1.类 class
//2.接口 interface
//3.数组 array


////⑥数值型 - 整数类型的使用
//public class mycode1 {
//	
//	public static void main(String[] args) {
//		
//		int a = 100;          //十进制
//		int b = 015;          //八进制
//		int c = 0xff;         //十六进制 
//		int d = 0b1001010101; //二进制
//		
//		byte e = 50;
//		short f = 300;
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		
//		int salary = 30000; //整型常量默认类型是int
//		long yearSalary = 300000000L; //把整型常量定义为long类型,所以必须把int改成long
//		System.out.println("Your year salary is " + yearSalary);
//		
//	}
//}

////1.2 float 浮点型的基本用法
//public class mycode1 {
//	
//	public static void main(String[] args) {
//		
//		double d1 = 3.14;
//		double d2 = 3.14E2; //科学计数法
//		
//		float f1 = 1.65F;//浮点常量的默认类型是F，需要在尾巴加F，因为需要从double改成float。
//		
//		//浮点数是不精确的，尽量不要直接比较，比如下面的示例，该正确的却显示错误，该错误的则是正确。
//		//如果需要使用特别精确的计算比较方式，则采用BigDecimal
//		
//		float f2 = 0.1F;
//		double d3 = 1.0/10;
//		System.out.println(f2==d3); //一个等于号是赋值，两个等于号是比较。
//		
//		float f4 = 223525456985L;
//		float f5 = f4+1;
//		System.out.println(f4==f5);
//				
//		System.out.println(d2);
//	}
//}

//2.字符型Char 最初的字符型是ASCII (American Standard Code for Information Interchange)
//
//public class mycode1 {
//	
//	public static void main(String[] args) {
//		char c1 = 'a';
//		char c2 = 'b';
//				
//		System.out.println(c1);
//		System.out.println(c2);
//		
//		//java中字符串不是基本数据类型，而是一个类
//		String str = "I love China.";
//		System.out.println(str);
//		
//		//转义字符
//		char c5 = '\n';
//		System.out.println("a\n\"b\"\nc\n\'e\'\n\\f\ng");
//		System.out.println("o\tp\tq\tr\ts\tt");
//		
//	}
//}

////3.boolean布尔型，有两个常量值，true和false。在内存中占用1个字节或者4个字节，不可以用0或者非0的整数替代。这点和C语言不同、
//public class mycode1 {
//	
//	public static void main (String [] args) {
//		boolean b1 = true;
//		boolean b2 = false;
//		
//		if (b1==true) {//前面括号里写单独的b1也可以，少写少出错。一定要简洁。
//			System.out.println("b1 is true.");
//		}else {
//			System.out.println("b1 is false.");
//		}
//	}
//}


//运算符 operator

//算术运算符（Arithmetic Operators）：TestOperator01 测试算术运算符的用法
//加法：+ (Addition)
//减法：- (Subtraction)
//乘法：* (Multiplication)
//除法：/ (Division)
//取模（取余数）：% (Modulus)

//public class mycode1 {
//	
//	public static void main(String[] args) {
//		
//		int a = 3;
//		long b = 4;
//		long c = a + b;
//		
//		double d = 3 + 3.14;
//		int d2 = 32/3;
//		//double d2 = 32.0/3; 两个整数相除，直接保留整数部分。
//		
//		
//		//+，-，*，/
//		//取余数
//		int e = 10%3;//取余操作，结果符号和左边操作数相同
//		System.out.println(e);
//		
//		//测试自增，自减
//		int g = 30;
//		g++; //相当于：g = g+1;
//		g--; //相当于：g = g-1;
//		
//		g=10;
//		int h = g++;  //g++先赋值，后自增
//		g=10;
//		int i = ++g; //++g先自增，后赋值
//		
//		System.out.println(h);
//		System.out.println(g);
//
//	}
//}

////测试扩展运算符的用法 赋值运算符（Assignment Operators）TestOperator02
//赋值：= (Assignment)
//加等于：+= (Add and assign)
//减等于：-= (Subtract and assign)
//乘等于：*= (Multiply and assign)
//除等于：/= (Divide and assign)
//取模等于：%= (Modulus and assign)

//public class mycode1 {
//	
//	public static void main(String[] args) {
//		int a = 3;
//		int b = 4;
//		
//		a += b; //相当于：a = a+b
//		System.out.println(a);
//		//a -= b, 相当于 a = a-b
//		//下面乘法遵循 先乘除后加减。                           
//		
//		a = 3;
//		a *= b+3;  //相当于：a=a*（b+3）括号是个整体，是必须要的
//		System.out.println(a);
//	}
//}

////测试关系运算符的用法 TestOperator03
//等于：== (Equal to)
//不等于：!= (Not equal to)
//大于：> (Greater than)
//小于：< (Less than)
//大于等于：>= (Greater than or equal to)
//小于等于：<= (Less than or equal to)

//public class mycode1 {
//	
//	public static void main(String[] args) {
//		int a = 3;
//		int b = 4;
//		boolean c = a>b;
//		System.out.println(c);
//		
//		char d='h';
//		//char值位于0~65536之间，可以用（int）强制转型。
//		System.out.println((int)d);
//		boolean e = d>100;
//		System.out.println(e);
//		
//	}
//}


////测试逻辑运算符的用法（Logical Operators）：
//与：&& (Logical AND)
//或：|| (Logical OR)
//非：! (Logical NOT)

//public class mycode1 {
//	
//	public static void main(String[] args) {
//		
//		boolean b1 = true;
//		boolean b2 = false;
//		System.out.println(b1&b2);//与 and： 有一个false，结果为false
//		System.out.println(b1|b2);//或 or：有一个true，结果为true
//		System.out.println(!b2);//取反Not
//		System.out.println(b1^b2);//异或XOR：相同false，不同true
//		
//		//短路与、短路或
//		//短路与的英文是 "short-circuit AND"，通常表示为 &&。
//		//短路或的英文是 "short-circuit OR"，通常表示为 ||。
//		
//		//int b3 = 3/0; 该代码会报错异常，因为不能除以0。错误代码：Java.ArithmeticException.
//		
//		boolean b3 = 1>2 && (4<3/0);
//		System.out.println(b3);
//		
//	}
//}


//测试位运算符的用法（Bitwise Operators）：
//与：& (Bitwise AND)
//或：| (Bitwise OR)
//异或：^ (Bitwise XOR)
//取反：~ (Bitwise NOT)
//左移：<< (Left shift)左移一位等于乘2
//右移：>> (Right shift)右移一位等于除2取商
//无符号右移：>>> (Unsigned right shift)

//二进制
//
//public class mycode1{
//	
//	public static void main(String[] args) {
//		int a = 7;
//		int b = 8;
//		System.out.println(a&b);//结果：0
//		System.out.println(a|b);//结果：15
//		System.out.println(a^b);//结果：15
//		System.out.println(~b);//结果：-9
//		
//		//移位
//		//乘以2或者除以2，使用移位操作，高效！
//		int c = 5 << 2; //相当于5*2*2
//		int d = 5 << 1; //相当于5*2
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(40>>3); //相当于40除8
//	}
//}

////测试字符串连接符的用法 “+”
//
//public class mycode1{
//	
//	public static void main(String[] args) {
//		String a = "3";
//		int b = 4;
//		System.out.println(a+b);
//		
//		//条件是string，不是char，若是char，则仍然是加法
//		
//		char c1 = 'h';
//		char c2 = 'i';
//		System.out.println(c1+c2);
//		//通过加空字符串，让整个+都变成连接符
//		System.out.println(""+c1+c2);
//	}
//}
//      String str1 = "Hello";
//      String str2 = "World";
//      String result = str1 + " " + str2; // 连接 str1 和 str2，结果是 "Hello World"


////测试条件运算符的用法，条件运算符在Java中通常被称为 "三元运算符ternary operator"，因为它由三个操作数组成。它的一般形式如下：
//result = condition ? value1 : value2;
//这个运算符的工作方式如下：condition 是一个布尔表达式，如果它的值为真（true），则整个表达式的值为 value1。
//如果 condition 的值为假（false），则整个表达式的值为 value2。
//具体示例：
//int x = 10;
//int y = 20;
//
//int max = (x > y) ? x : y; // 如果 x 大于 y，则 max 等于 x，否则等于 y
//在这个示例中，如果 x 大于 y，则 max 的值将等于 x（即10），否则它将等于 y（即20）。
//三元运算符通常用于简单的条件分支，使代码更紧凑和可读性更高。但要注意，不要滥用它，因为在某些情况下，使用普通的 if-else 语句可能更容易理解。
//
//
//public class mycode1 {
//	
//	public static void main(String[]args) {
//		int score = 90;
//		String a = score < 60? "fail" : "pass" ;
//		
//		System.out.println(a);
//		
//		if(score<60) {
//			a = "fail";
//		}else {
//			a = "pass";
//		}
//		
//		int x = -100;
//		int flag = x > 0 ? 1 : (x == 0 ? 0 : -1);
//		System.out.println(flag); //结果：-1
//		
//		//优先级问题的用法
//		boolean s1=true,s2=true,s3=false;
//		System.out.print(s1||s2&&s3);//逻辑运算符：非>与>或\
//		
//		boolean s4 = (3>1||4>3)&&(3<5);
//		System.out.print(s4);
//		
//	}
//}

//运算符的优先级
//当我列出运算符的优先级时，我已经将它们的英文名称包括在内。以下是每个运算符及其对应的英文名称：
//
//一元运算符（Unary Operators）：
//++（自增，Increment）和 --（自减，Decrement）
//+（正号，Positive）和 -（负号，Negative）
//!（逻辑非，Logical NOT）
//~（位非，Bitwise NOT）

//乘法和除法运算符（Multiplicative Operators）：
//*（乘法，Multiplication）
///（除法，Division）
//%（取模，Modulus）

//加法和减法运算符（Additive Operators）：
//+（加法，Addition）
//-（减法，Subtraction）

//移位运算符（Shift Operators）：
//<<（左移，Left Shift）
//>>（带符号右移，Signed Right Shift）
//>>>（无符号右移，Unsigned Right Shift）

//关系运算符（Relational Operators）：
//<（小于，Less Than）
//>（大于，Greater Than）
//<=（小于等于，Less Than or Equal To）
//>=（大于等于，Greater Than or Equal To）
//instanceof（类型检查，Instanceof）

//相等性运算符（Equality Operators）：
//==（等于，Equal To）
//!=（不等于，Not Equal To）

//按位与运算符（Bitwise AND）
//
//按位异或运算符（Bitwise XOR）
//
//按位或运算符（Bitwise OR）
//
//逻辑与运算符（Logical AND）
//
//逻辑或运算符（Logical OR）
//
//条件运算符（Ternary Conditional Operator）：? :
//
//赋值运算符（Assignment Operators）
//
//Lambda 表达式运算符（Lambda Expression Operators）
//
//逗号运算符（Comma Operator）
//请注意，优先级高的运算符在表达式中会先被执行
//而优先级相同的运算符通常会根据结合性从左到右执行。
//如果你想要改变运算符的执行顺序，可以使用括号 () 来明确指定表达式的计算顺序。


//自动类型转换
//public class mycode1 {
//	
//	public static void main(String[] args) {
//		//容量小的类型可以自动转化成容量大的类型
//		int a = 2345;
//		long b = a;
//		//int c = b; //long类型不能自动转化成int
//		double d = b;
//		float f = b;
//		
//		//特例：整型常量是int类型，但是可以自动转成:byte/short/char.
//		//只要不超过对应类型的表数范围
//		byte h1;
//		//byte h2 = 1234; //1234超过了byte的表数范围,范围是128
//		
//		char h3 = 97;
//		char h4 = 97+25;
//		System.out.print(h3);
//		System.out.print(h4);
//	}
//}

//测试类型强制转换cast,精度损失，语法格式：(type)var
//public class mycode1 {
//	
//	public static void main(String[] args) {
//		double  a = 3.94152;
//		int b = (int)a;//浮点数强转为整数，直接丢失小数部分
//		System.out.println(b);
//		
//		int c = 97;
//		char d = (char)c;
//		System.out.println(d);
//		
//		//强制转型，超过了表数范围，则会转成一个完全不同的值,没有任何意义。
//		byte e = (byte)300;
//		System.out.println(e);
//		
//	}
//}

//测试常见错误之 溢出
//public class mycode1 {
//	
//	public static void main(String[] args) {
//		
//		int money = 1000000000; //10亿
//		int years = 20;
//		//返回的total是负数，超过了int的范围
//		int total = money*years;
//		System.out.println("total="+total);
//		//返回的total仍然是负数，默认是int，因此结果会转成int值，再转成long
//		long total1 = money*years;
//		System.out.println("total="+total1);
//		//返回的total2正确，先将一个因子变成long，整个表达式发生提升，全部用long来表示。
//		//long total2 = money*((long)years);下面的方法也可以
//		long total2 = 1L*money*years;
//		System.out.println("total2="+total2);
//	}
//}


//Scanner 处理键盘输入
