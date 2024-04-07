import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ItemFactoryTest1 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (short) 100, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) '4', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) '4', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 1L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 10L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (-1.0d), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 'a', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 100L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 'a', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        york.eecs.bt.ItemFactory itemFactory0 = new york.eecs.bt.ItemFactory();
        java.lang.Class<?> wildcardClass1 = itemFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 0, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 0L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 100.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (byte) -1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (byte) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 100.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", 10.0d, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (-1.0f), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 0.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) '4', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", 10.0d, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (short) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 1.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", 0.0d, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (-1L), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 1L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 0L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", 0.0d, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (short) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (-1), "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (short) 100, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (short) 10, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (-1), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (short) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (short) -1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (byte) 1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", 1.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) ' ', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", 0.0d, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", 0.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 0.0f, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (-1L), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (short) -1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 100L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 0L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", 10.0d, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) ' ', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 1L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 10.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", 0.0d, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (-1.0d), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", 1.0d, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 1L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) '4', "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (byte) -1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) 0, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (short) 10, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) ' ', "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (byte) -1, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 100, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 100, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 'a', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (short) 100, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (byte) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) (byte) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 100L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 10, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) (short) 10, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) (short) 10, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 100.0f, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 0, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "", (double) 10L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (short) 10, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "hi!", (double) (byte) 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) (byte) 0, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 100L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "", (double) 10L, "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "hi!", (double) 0.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) (byte) -1, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 100L, "hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", 100.0d, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", 10.0d, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) (byte) -1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("", "hi!", (double) 1L, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("hi!", "", (double) 0, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test96");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 'a', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test97");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.saveItem("hi!", "", (double) 1.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test98");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 100.0f, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test99() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test99");
        york.eecs.bt.Item item5 = york.eecs.bt.ItemFactory.getItem("", "hi!", (double) 100L, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(item5);
    }
}

