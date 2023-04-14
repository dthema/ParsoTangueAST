import hu.webarticum.treeprinter.printer.listing.ListingTreePrinter;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class Tests {
    @Test
    public void secondListingTest() {
        try (InputStream inputStream = this.getClass().getResourceAsStream("listing2.parso")) {
            var root = ParsoTangueTreeProvider.treeFromStream(inputStream);
            Assert.assertEquals(1, root.children().size());
            Assert.assertEquals(3, root.children().get(0).children().get(2).children().size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
