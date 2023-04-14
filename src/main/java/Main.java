import hu.webarticum.treeprinter.printer.listing.ListingTreePrinter;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new ListingTreePrinter().print(ParsoTangueTreeProvider.treeFromStream(new FileInputStream(args[0])));
        } catch (IOException e) {
            System.err.println("Cannot open input stream for file");
            e.printStackTrace();
        }
    }
}