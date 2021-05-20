public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Ingresar una operacion y dos numeros");
        }
        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0d;
        switch (operacion){
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "multi":
                resultado =a*b;
                break;
            case "div":
                if (b==0){
                    System.exit(-1);
                    System.out.println("No se puede dividir en 0");
                }
                resultado =(double) a/b;
                break;
            default:
                resultado = a+b;
        }
        System.out.println("Resultado de la operacion es: "+resultado);
    }
}
