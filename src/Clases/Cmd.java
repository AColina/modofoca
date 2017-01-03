package Clases;

import Controladores.Controlador_Principal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel Colina
 */
public class Cmd {

    public static void login() {
        try {
            Process p = Runtime.getRuntime().exec("net use \\\\modofoca /user:amiwito [0%7a$3%a");
            System.out.println("abre");
            java.io.BufferedReader stdError = new java.io.BufferedReader(new java.io.InputStreamReader(p.getErrorStream()));

            // Leemos los errores si los hubiera
            while (stdError.ready()) {
                System.out.println(stdError.readLine() + "\n");
            }
        } catch (java.io.IOException ex) {
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
    }

    public static void logout() {
        try {
            Runtime.getRuntime().exec("net use \\\\modofoca /delete /yes");
            System.out.println("cerro");
        } catch (java.io.IOException ex) {
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
    }

    public static void explorer(String ruta) {
        try {
            Process p = Runtime.getRuntime().exec("explorer.exe \"" + ruta + "\"");
            System.out.println("cerro");
        } catch (java.io.IOException ex) {
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
    }

    public static void vlc(String ruta) {
        try {
            Process p = Runtime.getRuntime().exec("\"C:\\Archivos de programa\\VideoLAN\\VLC\\vlc.exe\" \"" + ruta + "\"");
            new Registro().Actividad("Ejecutar", ruta);
        } catch (java.io.IOException ex) {
            Utilidades.writeException(ex);
        }
    }

    public static void clipboard(String archivos[]) {
        try {
            String aux = "";
            for (String archivo : archivos) {
                aux += "\"" + archivo + "\" ";
            }
            aux += "a";
            Process p = Runtime.getRuntime().exec(Controlador_Principal.getRuta() + "dist\\lib\\toclipborad.exe " + aux);
        } catch (java.io.IOException ex) {
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
    }

    public static void visor(String ruta) {
        try {
            Process p = Runtime.getRuntime().exec("rundll32.exe C:\\WINDOWS\\system32\\shimgvw.dll,ImageView_Fullscreen " + ruta);
            new Registro().Actividad("Ejecutar", ruta);
        } catch (java.io.IOException ex) {
            Utilidades.writeException(ex);
        }
    }

    public static void rar(String ruta) {
        try {

            Process p = Runtime.getRuntime().exec("explorer.exe " + ruta);
        } catch (java.io.IOException ex) {
            Utilidades.writeException(ex);
        }
    }

    public static void otros(String ruta) {
        try {
            Process p = Runtime.getRuntime().exec("cmd /c \"" + ruta + "\"");
        } catch (java.io.IOException ex) {
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
    }

    public static boolean deleteFolder(String folder) {
        try {
            Process p = Runtime.getRuntime().exec("cmd /c rd \"" + folder + "\" /s /q");
        } catch (java.io.IOException ex) {
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
        return true;
    }

    public static int getProxy() {
        try {
            Process p = Runtime.getRuntime().exec("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\" /v ProxyEnable");
            p.waitFor();
            java.io.BufferedReader stdError = new java.io.BufferedReader(new java.io.InputStreamReader(p.getInputStream()));

            // Leemos los errores si los hubiera
            String texto = "";
            while (stdError.ready()) {
                texto += stdError.readLine() + "\n";
            }

            //retorna 0 si el proxy no esta activo y 1 si esta activo
            if (texto.length() > 0) {
                System.out.println(texto);
                return Integer.parseInt("" + texto.charAt(texto.length() - 3));
            }
        } catch (java.io.IOException ex) {
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cmd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.lang.StringIndexOutOfBoundsException ex) {
            return -1;
        }
        return 0;
    }

    public static boolean setProxy(boolean estado) {
        try {
            int activarProxy = Boolean.compare(estado, Boolean.FALSE);
            Process p = Runtime.getRuntime().exec("REG query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\" /v ProxyServer");
            p.waitFor();

            java.io.BufferedReader stdError = new java.io.BufferedReader(new java.io.InputStreamReader(p.getInputStream()));
            String v = "";
            // Leemos los errores si los hubiera
            while (stdError.ready()) {
                v += stdError.readLine() + "\n";
            }
            if (!v.substring(v.lastIndexOf("modofoca"), v.lastIndexOf(""+Controlador_Principal.puertoProxy) + 4).trim().equalsIgnoreCase("modofoca:"+Controlador_Principal.puertoProxy)) {
                System.out.println("conf proxy no existe");
                p = Runtime.getRuntime().exec("REG ADD \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\" /v ProxyServer  /d \"modofoca:"+Controlador_Principal.puertoProxy+";\" /t REG_SZ /f");
                p.waitFor();
                stdError = new java.io.BufferedReader(new java.io.InputStreamReader(p.getInputStream()));

                // Leemos los errores si los hubiera
                String texto = "";
                while (stdError.ready()) {
                    System.out.println(stdError.readLine());
                    texto += stdError.readLine() + "\n";
                }
            } else {
                System.out.println("conf proxy existe");
            }

            p = Runtime.getRuntime().exec("REG ADD \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\" /v ProxyEnable  /d \"" + activarProxy + "\" /t REG_SZ /f");
            p.waitFor();
            System.out.println("REG ADD \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\" /v ProxyEnable  /d \"" + activarProxy + "\" /t REG_SZ /f");
            stdError = new java.io.BufferedReader(new java.io.InputStreamReader(p.getInputStream()));

            // Leemos los errores si los hubiera
            String texto = "";
            while (stdError.ready()) {
                System.out.println(stdError.readLine());
                texto += stdError.readLine() + "\n";
            }
            return true;
        } catch (java.io.IOException ex) {
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cmd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
