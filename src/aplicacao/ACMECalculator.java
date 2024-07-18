package aplicacao;

import java.util.ArrayList;

public class ACMECalculator {

    private ArrayList<String> calculos;
    private StringBuilder sb;

    public ACMECalculator() {
        sb = new StringBuilder();
    }

    public void limpar() {
        sb.setLength(0);
    }

    public void apagar() {
        int length = sb.length();
        sb.deleteCharAt(length - 1);
    }

    public boolean addNum(char n) {
        if(n == ',') {
            for(int i = 0; i < sb.length(); i++) {
                if(sb.charAt(i) == ',') {
                    return false;
                }
            }
        }
        sb.append(n);
        return  true;
    }

    public void result() {
        // Dividir a expressão no operador "+"
        String[] partes = sb.toString().split("\\+");

        // Converter as partes para inteiros
        int numero1 = Integer.parseInt(partes[0]);
        int numero2 = Integer.parseInt(partes[1]);

        // Realizar a soma
        int resultado = numero1 + numero2;

        // Construir a expressão e o resultado
        limpar();
        sb.append(numero1).append("+").append(numero2).append("=").append(resultado);

    }

    public StringBuilder getSb() {
        return sb;
    }

}



/*
public static int avaliarExpressao(String expressao) {
    // Pilhas para números e operadores
    Stack<Integer> numeros = new Stack<>();
    Stack<Character> operadores = new Stack<>();

    for (int i = 0; i < expressao.length(); i++) {
        char c = expressao.charAt(i);

        // Ignorar espaços em branco
        if (Character.isWhitespace(c)) {
            continue;
        }

        // Se o caractere for um número, capturar o número completo
        if (Character.isDigit(c)) {
            StringBuilder sb = new StringBuilder();
            while (i < expressao.length() && Character.isDigit(expressao.charAt(i))) {
                sb.append(expressao.charAt(i++));
            }
            i--;
            numeros.push(Integer.parseInt(sb.toString()));
        } else if (c == '(') {
            // Se for um parêntese de abertura, empilhar na pilha de operadores
            operadores.push(c);
        } else if (c == ')') {
            // Se for um parêntese de fechamento, resolver toda a expressão dentro dos parênteses
            while (operadores.peek() != '(') {
                numeros.push(aplicarOperador(operadores.pop(), numeros.pop(), numeros.pop()));
            }
            operadores.pop();
        } else if (c == '+' || c == '-' || c == '*' || c == '/') {
            // Se for um operador, considerar precedência
            while (!operadores.isEmpty() && precedencia(c) <= precedencia(operadores.peek())) {
                numeros.push(aplicarOperador(operadores.pop(), numeros.pop(), numeros.pop()));
            }
            operadores.push(c);
        }
    }

    // Aplicar os operadores restantes na pilha
    while (!operadores.isEmpty()) {
        numeros.push(aplicarOperador(operadores.pop(), numeros.pop(), numeros.pop()));
    }

    // O resultado final estará na pilha de números
    return numeros.pop();
}

public static int precedencia(char operador) {
    switch (operador) {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        default:
            return -1;
    }
}

public static int aplicarOperador(char operador, int b, int a) {
    switch (operador) {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0) {
                throw new UnsupportedOperationException("Divisão por zero não é permitida");
            }
            return a / b;
        default:
            return 0;
    }
}*/
