package d04.s01;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FileSystemsMain {

    public static void main(String[] args) {
        String userHome = System.getProperty("user.home");
        System.out.println("The current user home folder is " + userHome);

        Path userPath = Paths.get(userHome);
        System.out.println(userPath.toFile().canWrite());

        File file = new File("/Users/something");
        System.out.println(file.exists() + ", " + file.canWrite());

        String createdFileName = "new-file.txt";
        List<String> lines = Arrays.asList("First line", "second line");
        Path createdFilePath = Paths.get(userHome, createdFileName);

        try {
            Files.write(createdFilePath, lines, StandardCharsets.UTF_8);
            System.out.println("The file was written");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //getNetworkIPs();
    }

    private static void getNetworkIPs() {
        try {
            final Set<NetworkInterface> networkInterfaces = NetworkInterface.networkInterfaces()
                                                                            .collect(Collectors.toSet());
            for (NetworkInterface interf : networkInterfaces) {
                final Enumeration<InetAddress> inetAddresses = interf.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    final InetAddress inetAddress = inetAddresses.nextElement();
                    final String hostAddress = inetAddress.getHostAddress();
                    if (!inetAddress.isLoopbackAddress() && !hostAddress.contains(":")) { // display just the IPv4 addresses
                        System.out.println(hostAddress);
                    }
                }
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }
}
