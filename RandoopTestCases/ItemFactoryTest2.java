import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ItemFactoryTest2 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 100L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (short) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 1.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (short) -1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 10.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (short) -1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (byte) -1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 100.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (-1.0f), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (short) 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", 10.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (short) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (-1.0d), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 'a', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 0, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 'a', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) ' ', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (-1), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) ' ', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (short) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 1.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", 10.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) '#', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 1L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 10.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) '4', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 1L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (short) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (short) 1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) '#', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (-1.0d), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) '#', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 100.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 1L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) '4', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 10L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 0L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (byte) 100, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (byte) -1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 100L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", 100.0d, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (-1), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 10.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (byte) 100, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 100L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (-1L), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (short) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 0L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 100.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (short) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (-1L), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (byte) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (byte) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", 100.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 0L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (byte) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 0L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", 1.0d, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (byte) 10, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (short) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (-1), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", 100.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (-1.0d), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) ' ', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 1.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 0L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 1.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", 100.0d, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 100L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 10.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (-1), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (short) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (short) 100, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) '#', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (short) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (byte) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", 0.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (-1.0d), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (-1.0f), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 100.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (-1.0d), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) '#', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 10L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (byte) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 10.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (short) 0, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 1L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (-1.0f), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 100.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", 100.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (byte) -1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 0.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (-1), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 1.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (short) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (byte) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (short) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 100.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) '#', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 'a', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 'a', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (short) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (byte) 10, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 0.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", 100.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", 1.0d, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 10L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 0, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 0L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 1.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (-1L), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) -1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) ' ', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (-1L), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) '4', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", 0.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", 1.0d, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 10.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (short) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (-1L), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 0.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) '4', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 100.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (byte) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (byte) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 1L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (short) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (byte) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 0L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (-1), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 10L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (short) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) '4', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 1L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 'a', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (short) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 10.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (byte) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 0L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (byte) 100, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 0.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) '#', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) ' ', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 0L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (-1.0d), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (short) 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 1.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (short) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (byte) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 10L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (short) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (short) -1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (-1L), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (short) 100, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (-1.0f), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 0.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 100.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (-1), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) '#', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (-1L), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (byte) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (byte) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (byte) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (short) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 10.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 10L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (short) 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (short) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 0L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (-1), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", 1.0d, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", 1.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 1.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (-1.0f), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (byte) 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 0L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (byte) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", 1.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 10L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 0L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (-1.0f), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (short) 100, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", 10.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) 10, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (byte) 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (byte) 1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 10L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 1.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (byte) -1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 100, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 0, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (-1.0f), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 0L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (short) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (-1.0f), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 1L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (byte) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (short) -1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (-1.0f), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", 10.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (byte) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (-1), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (-1), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 'a', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 1L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", 10.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (short) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (-1), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (byte) 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (short) -1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 0.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (byte) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 'a', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) '4', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (-1.0d), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (byte) 1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 100.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 10.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) '4', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 100.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 100L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (short) -1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (byte) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", 1.0d, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (byte) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 1L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (short) -1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 10L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) '#', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 1L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", 1.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", 10.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (-1L), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", 1.0d, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", 1.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) ' ', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", 100.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (-1L), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 10.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 1L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (-1.0f), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 1.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (short) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", 10.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 10L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 1.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", 100.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", 0.0d, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (-1.0d), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 100, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) '4', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) '4', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 'a', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (short) 10, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", 100.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", 1.0d, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (-1L), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (byte) -1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) ' ', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (-1.0d), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (-1), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", 10.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 10L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 100.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 100.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", 100.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (short) -1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", 10.0d, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) '4', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 'a', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (-1.0f), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 1L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (short) -1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (short) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (-1.0d), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 1.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 'a', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (byte) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (short) 100, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 0.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", 100.0d, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (byte) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (byte) 1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (byte) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (byte) -1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (-1.0d), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (-1.0f), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) '4', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 1L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (short) -1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (short) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 0, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (-1L), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (short) 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 10L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (short) 100, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 100.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 0.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 0L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 100, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (byte) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (byte) 10, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", 0.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 0L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (-1.0d), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (byte) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (-1.0f), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (short) 1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) 100, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (short) 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) '#', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 100L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", 100.0d, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (short) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 10.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", 100.0d, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (-1.0f), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (byte) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (byte) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 'a', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (byte) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 100L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (byte) 0, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (-1), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (byte) 100, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 1.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (short) 100, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) -1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (byte) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (-1L), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) ' ', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (-1), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (short) -1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (short) 1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 0.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 10L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) -1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (short) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", 1.0d, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 100L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 10, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 100.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (-1L), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) '#', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (byte) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 100L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 1.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (short) 1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 100, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", 1.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 10L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) 0, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (-1L), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 0.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (-1.0d), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 10, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 100, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (byte) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) ' ', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", 10.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 100L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 1L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test906");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (short) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test907");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (byte) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test908");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", 100.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test909");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) '4', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test910");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (byte) 100, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test911");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 100L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test912");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (byte) -1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test913");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) '#', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test914");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 100L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test915");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) '4', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test916");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 100.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test917");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 10.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test918");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 1.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test919");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (byte) -1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test920");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", 10.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test921");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 0.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test922");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (short) 10, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test923");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 'a', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test924");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 0L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test925");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 1L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test926");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 1L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test927");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (-1.0d), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test928");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (byte) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test929");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (short) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test930");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", 100.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test931");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", 10.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test932");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 1.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test933");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (-1L), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test934");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 100.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test935");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (byte) -1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test936");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) '4', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test937");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (short) -1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test938");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) '4', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test939");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 0L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test940");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) ' ', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test941");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (byte) 1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test942");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) 100, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test943");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 100L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test944");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 'a', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test945");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", 1.0d, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test946");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (byte) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test947");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 10L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test948");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 0L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test949");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 10L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test950");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) '#', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test951");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", 1.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test952");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) '4', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test953");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", 1.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test954");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) ' ', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test955");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (byte) 0, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test956");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) '#', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test957");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (short) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test958");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 10.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test959");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test960");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (-1), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test961");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) '#', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test962");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (byte) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test963");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 1.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test964");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) ' ', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test965");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (short) 10, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test966");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", 1.0d, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test967");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 0.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test968");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", 1.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test969");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (short) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test970");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (short) 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test971");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 100L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test972");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 1.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test973");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test974");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test975");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (short) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test976");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 1.0f, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test977");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (short) 1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test978");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) ' ', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test979");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (-1.0f), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test980");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test981");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (byte) 1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test982");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (-1L), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test983");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (byte) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test984");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", 100.0d, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test985");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 10.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test986");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 100L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test987");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test988");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) ' ', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test989");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 0L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test990");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) (short) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test991");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) ' ', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test992");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 10.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test993");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test994");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test995");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (short) -1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test996");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (-1L), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test997");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (short) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test998");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (byte) 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test999");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (short) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }
}

