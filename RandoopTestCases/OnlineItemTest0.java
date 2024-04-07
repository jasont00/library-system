import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OnlineItemTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 10.0d, "");
        java.lang.String str4 = onlineItem3.open();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(Display book contents here)" + "'", str4.equals("(Display book contents here)"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        java.lang.String str4 = onlineItem3.getOwner();
        double double5 = onlineItem3.getPrice();
        java.lang.String str6 = onlineItem3.getName();
        java.lang.String str7 = onlineItem3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        onlineItem3.setType("");
        java.lang.String str8 = onlineItem3.open();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(Display book contents here)" + "'", str8.equals("(Display book contents here)"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        int int4 = onlineItem3.getId();
        int int5 = onlineItem3.getId();
        java.lang.String str6 = onlineItem3.open();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34 + "'", int4 == 34);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(Display book contents here)" + "'", str6.equals("(Display book contents here)"));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        int int4 = onlineItem3.getId();
        onlineItem3.setPublisher("(Display book contents here)");
        onlineItem3.setPublisher("");
        onlineItem3.setRentable((java.lang.Boolean) false);
        java.lang.String str11 = onlineItem3.open();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "(Display book contents here)" + "'", str11.equals("(Display book contents here)"));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        java.lang.String str6 = onlineItem3.getName();
        onlineItem3.setType("(Display book contents here)");
        java.lang.String str9 = onlineItem3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        int int4 = onlineItem3.getId();
        java.lang.String str5 = onlineItem3.getOwner();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 41 + "'", int4 == 41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        java.lang.String str6 = onlineItem3.getName();
        double double7 = onlineItem3.getPrice();
        java.lang.String str8 = onlineItem3.open();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(Display book contents here)" + "'", str8.equals("(Display book contents here)"));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        int int4 = onlineItem3.getId();
        onlineItem3.setPublisher("(Display book contents here)");
        onlineItem3.setPublisher("");
        onlineItem3.setRentable((java.lang.Boolean) false);
        java.lang.String str11 = onlineItem3.getOwner();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 44 + "'", int4 == 44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("onlineitem", (java.lang.Double) (-1.0d), "hi!");
        java.lang.String str4 = onlineItem3.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("OnlineItem [name=, id=31, type=onlineitem, price=100.0, publisher=]", (java.lang.Double) 0.0d, "OnlineItem [name=, id=31, type=onlineitem, price=100.0, publisher=]");
        java.lang.Class<?> wildcardClass4 = onlineItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        onlineItem3.setType("");
        java.lang.String str8 = onlineItem3.toString();
        java.lang.String str9 = onlineItem3.getType();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str8 + "' != '" + "OnlineItem [name=, id=51, type=, price=100.0, publisher=]" + "'", str8.equals("OnlineItem [name=, id=51, type=, price=100.0, publisher=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        int int4 = onlineItem3.getId();
        int int5 = onlineItem3.getId();
        java.lang.String str6 = onlineItem3.getType();
        java.lang.String str7 = onlineItem3.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "onlineitem" + "'", str6.equals("onlineitem"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "OnlineItem [name=, id=52, type=onlineitem, price=100.0, publisher=]" + "'", str7.equals("OnlineItem [name=, id=52, type=onlineitem, price=100.0, publisher=]"));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        onlineItem3.setType("OnlineItem [name=, id=27, type=onlineitem, price=100.0, publisher=]");
        onlineItem3.setName("");
        onlineItem3.setType("OnlineItem [name=, id=27, type=onlineitem, price=100.0, publisher=]");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        onlineItem3.setType("OnlineItem [name=, id=27, type=onlineitem, price=100.0, publisher=]");
        onlineItem3.setName("");
        onlineItem3.setType("OnlineItem [name=, id=52, type=onlineitem, price=100.0, publisher=]");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("OnlineItem [name=, id=53, type=onlineitem, price=100.0, publisher=]", (java.lang.Double) 100.0d, "(Display book contents here)");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 10.0d, "");
        java.lang.String str4 = onlineItem3.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        int int4 = onlineItem3.getId();
        onlineItem3.setPublisher("(Display book contents here)");
        onlineItem3.setPublisher("");
        onlineItem3.setId((int) (short) -1);
        double double11 = onlineItem3.getPrice();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        java.lang.String str6 = onlineItem3.getName();
        java.lang.String str7 = onlineItem3.getPublisher();
        int int8 = onlineItem3.getId();
        onlineItem3.setName("OnlineItem [name=, id=27, type=onlineitem, price=100.0, publisher=]");
        double double11 = onlineItem3.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 61 + "'", int8 == 61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        java.lang.String str4 = onlineItem3.getName();
        java.lang.String str5 = onlineItem3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=62, type=onlineitem, price=100.0, publisher=]" + "'", str5.equals("OnlineItem [name=, id=62, type=onlineitem, price=100.0, publisher=]"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        java.lang.String str4 = onlineItem3.getOwner();
        onlineItem3.setPublisher("");
        onlineItem3.setType("(Display book contents here)");
        java.lang.Class<?> wildcardClass9 = onlineItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 10.0d, "");
        onlineItem3.setPublisher("");
        onlineItem3.setType("OnlineItem [name=, id=31, type=onlineitem, price=100.0, publisher=]");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("OnlineItem [name=, id=31, type=onlineitem, price=100.0, publisher=]", (java.lang.Double) 0.0d, "OnlineItem [name=, id=31, type=onlineitem, price=100.0, publisher=]");
        java.lang.String str4 = onlineItem3.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "OnlineItem [name=, id=31, type=onlineitem, price=100.0, publisher=]" + "'", str4.equals("OnlineItem [name=, id=31, type=onlineitem, price=100.0, publisher=]"));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        onlineItem3.setType("onlineitem");
        java.lang.String str8 = onlineItem3.getType();
        java.lang.Class<?> wildcardClass9 = onlineItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "onlineitem" + "'", str8.equals("onlineitem"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        int int4 = onlineItem3.getId();
        onlineItem3.setPublisher("(Display book contents here)");
        int int7 = onlineItem3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 73 + "'", int4 == 73);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 73 + "'", int7 == 73);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        java.lang.String str6 = onlineItem3.getName();
        java.lang.String str7 = onlineItem3.getPublisher();
        int int8 = onlineItem3.getId();
        java.lang.String str9 = onlineItem3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 76 + "'", int8 == 76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "onlineitem" + "'", str9.equals("onlineitem"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        java.lang.String str4 = onlineItem3.getOwner();
        double double5 = onlineItem3.getPrice();
        java.lang.String str6 = onlineItem3.getType();
        java.lang.String str7 = onlineItem3.getName();
        java.lang.String str8 = onlineItem3.open();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "onlineitem" + "'", str6.equals("onlineitem"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(Display book contents here)" + "'", str8.equals("(Display book contents here)"));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        int int4 = onlineItem3.getId();
        onlineItem3.setPublisher("(Display book contents here)");
        onlineItem3.setPublisher("");
        java.lang.String str9 = onlineItem3.toString();
        java.lang.String str10 = onlineItem3.getType();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "OnlineItem [name=, id=79, type=onlineitem, price=100.0, publisher=]" + "'", str9.equals("OnlineItem [name=, id=79, type=onlineitem, price=100.0, publisher=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "onlineitem" + "'", str10.equals("onlineitem"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        java.lang.String str6 = onlineItem3.open();
        java.lang.String str7 = onlineItem3.getName();
        onlineItem3.setType("OnlineItem [name=, id=52, type=onlineitem, price=100.0, publisher=]");
        java.lang.String str10 = onlineItem3.getPublisher();
        onlineItem3.setPrice((double) 79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(Display book contents here)" + "'", str6.equals("(Display book contents here)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        int int4 = onlineItem3.getId();
        onlineItem3.setPublisher("(Display book contents here)");
        onlineItem3.setPublisher("");
        onlineItem3.setId((int) (short) -1);
        java.lang.String str11 = onlineItem3.getPublisher();
        onlineItem3.setType("OnlineItem [name=, id=62, type=onlineitem, price=100.0, publisher=]");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 81 + "'", int4 == 81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        onlineItem3.setType("onlineitem");
        onlineItem3.setType("OnlineItem [name=, id=52, type=onlineitem, price=100.0, publisher=]");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        int int4 = onlineItem3.getId();
        int int5 = onlineItem3.getId();
        java.lang.String str6 = onlineItem3.toString();
        boolean boolean7 = onlineItem3.getRentable();
        onlineItem3.setType("OnlineItem [name=, id=53, type=onlineitem, price=100.0, publisher=]");
        onlineItem3.setId((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 83 + "'", int4 == 83);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 83 + "'", int5 == 83);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "OnlineItem [name=, id=83, type=onlineitem, price=100.0, publisher=]" + "'", str6.equals("OnlineItem [name=, id=83, type=onlineitem, price=100.0, publisher=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        int int4 = onlineItem3.getId();
        int int5 = onlineItem3.getId();
        java.lang.String str6 = onlineItem3.getType();
        java.lang.String str7 = onlineItem3.getPublisher();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 85 + "'", int4 == 85);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 85 + "'", int5 == 85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "onlineitem" + "'", str6.equals("onlineitem"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        java.lang.String str6 = onlineItem3.open();
        java.lang.Class<?> wildcardClass7 = onlineItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(Display book contents here)" + "'", str6.equals("(Display book contents here)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        java.lang.String str6 = onlineItem3.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "OnlineItem [name=, id=87, type=onlineitem, price=100.0, publisher=]" + "'", str6.equals("OnlineItem [name=, id=87, type=onlineitem, price=100.0, publisher=]"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        onlineItem3.setType("OnlineItem [name=, id=27, type=onlineitem, price=100.0, publisher=]");
        java.lang.Class<?> wildcardClass8 = onlineItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        java.lang.String str4 = onlineItem3.getOwner();
        double double5 = onlineItem3.getPrice();
        java.lang.String str6 = onlineItem3.getType();
        java.lang.String str7 = onlineItem3.getName();
        java.lang.String str8 = onlineItem3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "onlineitem" + "'", str6.equals("onlineitem"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str8 + "' != '" + "OnlineItem [name=, id=89, type=onlineitem, price=100.0, publisher=]" + "'", str8.equals("OnlineItem [name=, id=89, type=onlineitem, price=100.0, publisher=]"));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        int int4 = onlineItem3.getId();
        onlineItem3.setPublisher("(Display book contents here)");
        onlineItem3.setPublisher("");
        onlineItem3.setId((int) (short) -1);
        java.lang.String str11 = onlineItem3.getType();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 90 + "'", int4 == 90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "onlineitem" + "'", str11.equals("onlineitem"));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        int int4 = onlineItem3.getId();
        onlineItem3.setPublisher("(Display book contents here)");
        onlineItem3.setPublisher("");
        java.lang.String str9 = onlineItem3.toString();
        java.lang.String str10 = onlineItem3.getName();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 91 + "'", int4 == 91);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "OnlineItem [name=, id=91, type=onlineitem, price=100.0, publisher=]" + "'", str9.equals("OnlineItem [name=, id=91, type=onlineitem, price=100.0, publisher=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 10.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        java.lang.String str6 = onlineItem3.getName();
        int int7 = onlineItem3.getId();
        double double8 = onlineItem3.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 92 + "'", int7 == 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("OnlineItem [name=, id=53, type=onlineitem, price=100.0, publisher=]", (java.lang.Double) 1.0d, "");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        onlineItem3.setType("OnlineItem [name=, id=27, type=onlineitem, price=100.0, publisher=]");
        onlineItem3.setRentable((java.lang.Boolean) true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        onlineItem3.setType("onlineitem");
        java.lang.String str8 = onlineItem3.getType();
        onlineItem3.setId(1);
        onlineItem3.setId(73);
        onlineItem3.setType("OnlineItem [name=, id=46, type=, price=100.0, publisher=]");
        double double15 = onlineItem3.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "onlineitem" + "'", str8.equals("onlineitem"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        onlineItem3.setType("onlineitem");
        java.lang.String str8 = onlineItem3.getType();
        int int9 = onlineItem3.getId();
        onlineItem3.setPrice((double) 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "onlineitem" + "'", str8.equals("onlineitem"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        java.lang.String str6 = onlineItem3.open();
        java.lang.String str7 = onlineItem3.getName();
        onlineItem3.setType("OnlineItem [name=, id=52, type=onlineitem, price=100.0, publisher=]");
        onlineItem3.setName("OnlineItem [name=, id=27, type=onlineitem, price=100.0, publisher=]");
        java.lang.String str12 = onlineItem3.getOwner();
        onlineItem3.setPrice((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(Display book contents here)" + "'", str6.equals("(Display book contents here)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        onlineItem3.setRentable((java.lang.Boolean) false);
        java.lang.String str6 = onlineItem3.getName();
        java.lang.String str7 = onlineItem3.getPublisher();
        int int8 = onlineItem3.getId();
        java.lang.String str9 = onlineItem3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "OnlineItem [name=, id=98, type=onlineitem, price=100.0, publisher=]" + "'", str9.equals("OnlineItem [name=, id=98, type=onlineitem, price=100.0, publisher=]"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("", (java.lang.Double) 100.0d, "");
        int int4 = onlineItem3.getId();
        onlineItem3.setPrice((double) 0L);
        boolean boolean7 = onlineItem3.getRentable();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        york.eecs.bt.OnlineItem onlineItem3 = new york.eecs.bt.OnlineItem("OnlineItem [name=, id=46, type=, price=100.0, publisher=]", (java.lang.Double) 100.0d, "OnlineItem [name=, id=79, type=onlineitem, price=100.0, publisher=]");
    }
}
