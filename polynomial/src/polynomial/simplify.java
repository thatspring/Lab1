//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : simplify.java
//  @ Date : 2016/12/1
//  @ Author : 
//
//

package polynomial;


public class simplify extends cal {
    public String cmd_pro(Object str_in, int flag) {
    	String temp_com=((String) str_in).substring(10);
		String[] val=temp_com.split("\\=");
		if(!((String) str_in).contains(val[0])){
			String error="Error, no variable";
			return error;
		}
		else{
			String sim_expression = "";
			String[] temp_exp = null;
			String[] temp_expre = null;
			String new_exp = "";
			String var="";
			int coefficient=1;
			int temp;
			int constant = 0;
			for(int i=0;i<Expression.length();i++){
				if(Expression.contains(var)){
					
					for(int j=0;j<temp_exp.length;j++){
						try{
							temp = Integer.valueOf(temp_exp[j]);
							coefficient *= temp;
						}catch (Exception e){
							var = var + "*" + temp_exp[j];
						}
					}
					new_exp+=Integer.toString(coefficient)+var;
					sim_expression+=new_exp + "+";
				}
				else{
					sim_expression+=Expression + "+";
				}
				var="";
				coefficient=1;
				new_exp = "";
			}
			sim_expression = sim_expression.replace("-1*", "-");
			sim_expression = sim_expression.replace("1*", "");
			sim_expression = sim_expression.substring(0, sim_expression.length()-1);
			temp_expre = sim_expression.split("\\+");
			sim_expression = "";
			for(int i=0;i<temp_expre.length;i++){
				try{
					temp = Integer.valueOf(temp_expre[i]);
					constant += temp;
				}catch (Exception e){
					sim_expression += "+" + temp_expre[i];
				}
			}
			if(constant!=0)
				sim_expression = Integer.toString(constant) + sim_expression;
			else
				sim_expression = sim_expression.substring(1);
			while(sim_expression.contains("+-")){
				sim_expression = sim_expression.replace("+-", "-");
			}
			while(sim_expression.contains("++")){
				sim_expression = sim_expression.replace("++", "+");
			}
			if(sim_expression.endsWith("+") || sim_expression.endsWith("-"))
				sim_expression = sim_expression.substring(0, sim_expression.length()-1);
			System.out.println(sim_expression);
			return sim_expression;
		}
		
    }
    
}
