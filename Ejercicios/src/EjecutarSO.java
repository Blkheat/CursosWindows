public class EjecutarSO {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
            Process process;
        try {
            if (System.getProperty("os.name").startsWith("Windows")){
                process = runtime.exec("notepad");
            }else{
                process = runtime.exec("regit");
            }
            process.waitFor();
        }catch (Exception e){
            System.err.println("El comando es desconodico "+e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el sistema");
        System.exit(0);
    }
}
