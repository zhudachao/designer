package prototype_register;


public class Client {
	
	public static void main(String[] args) {
		
		 try{
	            Prototype p1 = new ConcreteProtype1();
	            PrototypeManger.setPrototype("p1", p1);
	            //获取原型来创建对象
	            Prototype p3 = PrototypeManger.getPrototype("p1").clon();
	            p3.setName("张三");
	            System.out.println("第一个实例：" + p3);
	            //有人动态的切换了实现
	            Prototype p2 = new ConcreteProtype2();
	            PrototypeManger.setPrototype("p1", p2);
	            //重新获取原型来创建对象
	            Prototype p4 = PrototypeManger.getPrototype("p1").clon();
	            p4.setName("李四");
	            System.out.println("第二个实例：" + p4);
	            //有人注销了这个原型
	            PrototypeManger.removePrototype("p1");
	            //再次获取原型来创建对象
	            Prototype p5 = PrototypeManger.getPrototype("p1").clon();
	            p5.setName("王五");
	            System.out.println("第三个实例：" + p5);
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	    }

		
	
	

}
