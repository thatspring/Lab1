package polynomial;

import java.util.Scanner;
/*修改*/

public class Polynomial {
  /**
  *class information
  */
  static String expression = "";
  static String command = "";
  static String[] expre;

  static void simplify(String[] value) {
    String simExpression = "";
    String[] tempExp = null;
    String[] tempExpre = null;
    String newExp = "";
    String var = "";
    int coefficient = 1;
    int temp;
    int constant = 0;
    for (int i = 0; i < expre.length; i++) {
      if (expre[i].contains(value[0])) {
        expre[i] = expre[i].replaceAll(value[0], value[1]);
        tempExp = expre[i].split("\\*");
        for (int j = 0; j < tempExp.length; j++) {
          try {
            temp = Integer.valueOf(tempExp[j]);
            coefficient *= temp;
          } catch (Exception error) {
            var = var + "*" + tempExp[j];
          }
        }
        newExp += Integer.toString(coefficient) + var;
        simExpression += newExp + "+";
      } else {
        simExpression += expre[i] + "+";
      }
      var = "";
      coefficient = 1;
      newExp = "";
    }
    simExpression = simExpression.replace("-1*", "-");
    simExpression = simExpression.replace("1*", "");
    simExpression = simExpression.substring(0, simExpression.length() - 1);
    tempExpre = simExpression.split("\\+");
    simExpression = "";
    for (int i = 0; i < tempExpre.length; i++) {
      try {
        temp = Integer.valueOf(tempExpre[i]);
        constant += temp;
      } catch (Exception error) {
        simExpression += "+" + tempExpre[i];
      }
    }
    if (constant != 0) {
      simExpression = Integer.toString(constant) + simExpression;
    } else {
      simExpression = simExpression.substring(1);
    }
    while (simExpression.contains("+-")) {
      simExpression = simExpression.replace("+-", "-");
    }
    while (simExpression.contains("++")) {
      simExpression = simExpression.replace("++", "+");
    }
    if (simExpression.endsWith("+") || simExpression.endsWith("-")) {
      simExpression = simExpression.substring(0, simExpression.length() - 1);
    }
    System.out.println(simExpression);
    expression();
  }

  static void derivative(String value) {
    String[] temp = null;
    String[] strTemp = null;
    String tmp = null;
    String valStr = "";
    String temp0 = "**";
    String temp1 = "*";
    String derStr = "";
    int constant = 0;
    int count = 0;
    int coefficient = 1;
    for (int i = 0; i < expre.length; i++) {
      count = 0;
      if (expre[i].contains(value)) {
        temp = expre[i].split("\\*");
        for (int j = 0; j < temp.length; j++) {
          if (temp[j].equalsIgnoreCase(value)) {
            count++;
          }
        }
        tmp = Integer.toString(count) + "*" + expre[i].replaceFirst(value, "");
        try {
          tmp = tmp.replace(temp0, temp1);
        } catch (Exception error) {
        }
        if (tmp.endsWith("*")) {
          tmp = tmp.substring(0, tmp.length() - 1);
        }
        derStr += tmp + "+";
      }
    }
    derStr = derStr.substring(0, derStr.length() - 1);
    derStr = derStr.replace("-1*", "-");
    derStr = derStr.replace("1*", "");
    temp = derStr.split("\\+");
    derStr = "";
    for (int i = 0; i < temp.length; i++) {
      strTemp = temp[i].split("\\*");
      for (int j = 0; j < strTemp.length; j++) {
        try {
          count = Integer.valueOf(strTemp[j]);
          coefficient *= count;
        } catch (Exception error) {
          valStr += "*" + strTemp[j];
        }
      }
      derStr += Integer.valueOf(coefficient) + valStr + "+";
      valStr = "";
      coefficient = 1;
    }
    derStr = derStr.substring(0, derStr.length() - 1);
    temp = derStr.split("\\+");
    derStr = "";
    for (int i = 0; i < temp.length; i++) {
      try {
        count = Integer.valueOf(temp[i]);
        constant += count;
      } catch (Exception error) {
        derStr += "+" + temp[i];
      }
    }
    if (constant != 0) {
      derStr = Integer.toString(constant) + derStr;
    } else {
      derStr = derStr.substring(1);
    }
    while (derStr.contains("+-")) {
      derStr = derStr.replace("+-", "-");
    }
    while (derStr.contains("++")) {
      derStr = derStr.replace("++", "+");
    }
    System.out.println(derStr);
  }

  static void expression() {
    expre = expression.split("\\+");
  }

  static boolean judge(String expression) {
    boolean flag = true;
    String ch = null;
    String num = "0123456789";
    String charac = "+*-abcdefghijklmnopqrstuvwxyz    ";
    for (int i = 0; i < expression.length() && flag; i++) {
      ch = expression.substring(i, i + 1);
      ch = ch.toLowerCase();
      if (!num.contains(ch) && !charac.contains(ch)) {
        flag = false;
      }
    }
    return flag;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.print('>');
    Scanner sc = new Scanner(System.in);
    String strIn = null;
    strIn = sc.nextLine();
    String tempCom = null;
    String[] value = null;
    String valuename;
    while (!strIn.equals("!exit")) {
      long tm = System.currentTimeMillis();
      System.out.println("开始时间：" + tm);
      if (strIn.startsWith("!")) {
        command = strIn;
        if (!expression.isEmpty()) {
          if (command.startsWith("!simplify ")) {
            tempCom = command.substring(10);
            value = tempCom.split("\\=");
            if (!expression.contains(value[0])) {
              System.out.println("Error, no variable");
            } else {
              simplify(value);
            }
          } else if (command.startsWith("!d/d")) {
            valuename = command.substring(4);
            if (!expression.contains(valuename)) {
              System.out.println("Error, no variable");
            } else {
              derivative(valuename);
            }
          } else {
            System.out.println("no command!");
          }
        } else {
          System.out.println("no expression!");
        }
      } else {
        expression = strIn;
        if (judge(expression)) {
          expression = expression.replace(" ", "");
          expression = expression.replace(" ", "");
          System.out.println(expression);
          if (expression.startsWith("+")) {
            expression = expression.substring(1);
          }
          expression = expression.replace("-", "+-1*");
          expression();
        } else {
          System.out.println("illegal char");
        }
      }
      System.out.println("结束时间：" + System.currentTimeMillis());
      System.out.println("执行时间：" + (System.currentTimeMillis() - tm));
      System.out.print('>');
      strIn = sc.nextLine();
    }
    sc.close();
  }
}
