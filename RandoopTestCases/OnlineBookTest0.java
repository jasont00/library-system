import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OnlineBookTest0{

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        java.lang.Class<?> wildcardClass4 = onlineBook3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setName("hi!");
        java.lang.Class<?> wildcardClass6 = onlineBook3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setPublisher("");
        java.lang.Class<?> wildcardClass6 = onlineBook3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        java.lang.String str6 = onlineBook3.getName();
        onlineBook3.setName("");
        onlineBook3.available = true;
        onlineBook3.setPublisher("(Display textbook contents here)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        boolean boolean5 = onlineBook4.available;
        onlineBook4.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        onlineBook4.setPrice((double) (byte) -1);
        java.lang.String str7 = onlineBook4.getPublisher();
        onlineBook4.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        java.lang.String str6 = onlineBook3.getOwner();
        boolean boolean7 = onlineBook3.getRentable();
        java.lang.String str8 = onlineBook3.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = onlineBook4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        java.lang.String str6 = onlineBook3.getName();
        onlineBook3.setName("");
        java.lang.String str9 = onlineBook3.toString();
        onlineBook3.available = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "OnlineItem [name=, id=35, type=hi!, price=0.0, publisher=hi!]" + "'", str9.equals("OnlineItem [name=, id=35, type=hi!, price=0.0, publisher=hi!]"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        java.lang.String str6 = onlineBook3.getName();
        onlineBook3.setName("");
        onlineBook3.available = true;
        onlineBook3.setPrice((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        java.lang.String str6 = onlineBook3.getName();
        onlineBook3.setName("");
        java.lang.Class<?> wildcardClass9 = onlineBook3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        java.lang.String str6 = onlineBook3.getName();
        onlineBook3.setName("");
        java.lang.String str9 = onlineBook3.toString();
        java.lang.String str10 = onlineBook3.open();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "OnlineItem [name=, id=40, type=hi!, price=0.0, publisher=hi!]" + "'", str9.equals("OnlineItem [name=, id=40, type=hi!, price=0.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "(Display textbook contents here)" + "'", str10.equals("(Display textbook contents here)"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        boolean boolean6 = onlineBook3.getRentable();
        boolean boolean7 = onlineBook3.available;
        java.lang.String str8 = onlineBook3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        onlineBook4.setPrice((double) (byte) -1);
        java.lang.String str7 = onlineBook4.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("onlinebook", "OnlineItem [name=, id=35, type=hi!, price=0.0, publisher=hi!]", (double) 100, "OnlineItem [name=, id=40, type=hi!, price=0.0, publisher=hi!]");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        boolean boolean5 = onlineBook4.available;
        int int6 = onlineBook4.edition;
        onlineBook4.setType("OnlineItem [name=, id=19, type=hi!, price=0.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setName("");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("hi!", (double) (-1.0f), "");
        onlineBook3.setId(0);
        onlineBook3.setPublisher("");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        onlineBook4.setId((int) (byte) -1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setPublisher("");
        java.lang.String str6 = onlineBook3.getType();
        onlineBook3.setPublisher("OnlineItem [name=, id=35, type=hi!, price=0.0, publisher=hi!]");
        java.lang.Class<?> wildcardClass9 = onlineBook3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "onlinebook" + "'", str6.equals("onlinebook"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setPublisher("");
        java.lang.String str6 = onlineBook3.getType();
        java.lang.String str7 = onlineBook3.toString();
        onlineBook3.setPublisher("OnlineItem [name=, id=18, type=onlinebook, price=0.0, publisher=]");
        java.lang.String str10 = onlineBook3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "onlinebook" + "'", str6.equals("onlinebook"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "OnlineItem [name=, id=56, type=onlinebook, price=0.0, publisher=]" + "'", str7.equals("OnlineItem [name=, id=56, type=onlinebook, price=0.0, publisher=]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str10 + "' != '" + "OnlineItem [name=, id=56, type=onlinebook, price=0.0, publisher=OnlineItem [name=, id=18, type=onlinebook, price=0.0, publisher=]]" + "'", str10.equals("OnlineItem [name=, id=56, type=onlinebook, price=0.0, publisher=OnlineItem [name=, id=18, type=onlinebook, price=0.0, publisher=]]"));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setPublisher("");
        java.lang.String str6 = onlineBook3.getType();
        java.lang.String str7 = onlineBook3.toString();
        onlineBook3.setPublisher("OnlineItem [name=, id=18, type=onlinebook, price=0.0, publisher=]");
        java.lang.String str10 = onlineBook3.open();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "onlinebook" + "'", str6.equals("onlinebook"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "OnlineItem [name=, id=58, type=onlinebook, price=0.0, publisher=]" + "'", str7.equals("OnlineItem [name=, id=58, type=onlinebook, price=0.0, publisher=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "(Display textbook contents here)" + "'", str10.equals("(Display textbook contents here)"));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        java.lang.String str6 = onlineBook3.getOwner();
        onlineBook3.setRentable((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        java.lang.String str4 = onlineBook3.open();
        int int5 = onlineBook3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(Display textbook contents here)" + "'", str4.equals("(Display textbook contents here)"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        boolean boolean5 = onlineBook4.available;
        int int6 = onlineBook4.edition;
        double double7 = onlineBook4.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        boolean boolean6 = onlineBook3.getRentable();
        int int7 = onlineBook3.edition;
        boolean boolean8 = onlineBook3.available;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setPublisher("");
        java.lang.String str6 = onlineBook3.getType();
        java.lang.String str7 = onlineBook3.toString();
        boolean boolean8 = onlineBook3.available;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "onlinebook" + "'", str6.equals("onlinebook"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "OnlineItem [name=, id=66, type=onlinebook, price=0.0, publisher=]" + "'", str7.equals("OnlineItem [name=, id=66, type=onlinebook, price=0.0, publisher=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setPublisher("");
        int int6 = onlineBook3.edition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        onlineBook4.setPrice((double) (byte) -1);
        onlineBook4.setRentable((java.lang.Boolean) true);
        onlineBook4.setType("onlinebook");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("onlinebook", (double) 10L, "onlinebook");
        java.lang.String str4 = onlineBook3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "onlinebook" + "'", str4.equals("onlinebook"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        onlineBook4.setPrice((double) (byte) -1);
        java.lang.String str7 = onlineBook4.getPublisher();
        boolean boolean8 = onlineBook4.available;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("", "OnlineItem [name=, id=56, type=onlinebook, price=0.0, publisher=OnlineItem [name=, id=18, type=onlinebook, price=0.0, publisher=]]", 1.0d, "OnlineItem [name=, id=18, type=onlinebook, price=0.0, publisher=]");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        java.lang.String str6 = onlineBook3.getName();
        onlineBook3.setName("");
        onlineBook3.available = true;
        onlineBook3.setRentable((java.lang.Boolean) true);
        double double13 = onlineBook3.getPrice();
        onlineBook3.setType("OnlineItem [name=, id=58, type=onlinebook, price=0.0, publisher=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("onlinebook", (double) 10L, "hi!");
        onlineBook3.available = false;
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setName("hi!");
        onlineBook3.setType("onlinebook");
        int int8 = onlineBook3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 79 + "'", int8 == 79);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        onlineBook4.setPrice((double) (byte) -1);
        onlineBook4.setRentable((java.lang.Boolean) true);
        double double9 = onlineBook4.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        java.lang.String str6 = onlineBook3.getName();
        onlineBook3.setName("");
        onlineBook3.available = true;
        onlineBook3.setRentable((java.lang.Boolean) true);
        java.lang.String str13 = onlineBook3.open();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "(Display textbook contents here)" + "'", str13.equals("(Display textbook contents here)"));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        java.lang.String str4 = onlineBook3.getType();
        onlineBook3.setType("OnlineItem [name=, id=56, type=onlinebook, price=0.0, publisher=OnlineItem [name=, id=18, type=onlinebook, price=0.0, publisher=]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "onlinebook" + "'", str4.equals("onlinebook"));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        boolean boolean5 = onlineBook4.available;
        double double6 = onlineBook4.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        onlineBook3.setName("OnlineItem [name=, id=35, type=hi!, price=0.0, publisher=hi!]");
        java.lang.String str8 = onlineBook3.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str8 + "' != '" + "OnlineItem [name=OnlineItem [name=, id=35, type=hi!, price=0.0, publisher=hi!], id=84, type=hi!, price=0.0, publisher=hi!]" + "'", str8.equals("OnlineItem [name=OnlineItem [name=, id=35, type=hi!, price=0.0, publisher=hi!], id=84, type=hi!, price=0.0, publisher=hi!]"));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("OnlineItem [name=, id=35, type=hi!, price=0.0, publisher=hi!]", "onlinebook", (double) 1, "OnlineItem [name=, id=19, type=hi!, price=0.0, publisher=hi!]");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        java.lang.String str6 = onlineBook3.getName();
        onlineBook3.setName("");
        onlineBook3.available = true;
        onlineBook3.setRentable((java.lang.Boolean) true);
        double double13 = onlineBook3.getPrice();
        java.lang.String str14 = onlineBook3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        java.lang.String str6 = onlineBook3.getName();
        onlineBook3.setName("");
        onlineBook3.available = true;
        onlineBook3.setPublisher("OnlineItem [name=, id=40, type=hi!, price=0.0, publisher=hi!]");
        onlineBook3.setPrice((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("OnlineItem [name=, id=18, type=onlinebook, price=0.0, publisher=]", (double) (byte) -1, "OnlineItem [name=, id=35, type=hi!, price=0.0, publisher=hi!]");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        java.lang.String str6 = onlineBook3.getName();
        onlineBook3.setName("");
        onlineBook3.setName("OnlineItem [name=, id=18, type=onlinebook, price=0.0, publisher=]");
        onlineBook3.setPrice((double) 1L);
        onlineBook3.edition = (short) 0;
        onlineBook3.setName("OnlineItem [name=OnlineItem [name=, id=35, type=hi!, price=0.0, publisher=hi!], id=84, type=hi!, price=0.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        boolean boolean5 = onlineBook4.available;
        int int6 = onlineBook4.edition;
        onlineBook4.setPublisher("onlinebook");
        onlineBook4.setRentable((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        boolean boolean5 = onlineBook4.available;
        java.lang.String str6 = onlineBook4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "OnlineItem [name=hi!, id=91, type=onlinebook, price=52.0, publisher=hi!]" + "'", str6.equals("OnlineItem [name=hi!, id=91, type=onlinebook, price=52.0, publisher=hi!]"));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        onlineBook4.setPrice((double) (byte) -1);
        int int7 = onlineBook4.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 92 + "'", int7 == 92);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        java.lang.String str6 = onlineBook3.getName();
        onlineBook3.setName("");
        onlineBook3.available = true;
        onlineBook3.setRentable((java.lang.Boolean) true);
        double double13 = onlineBook3.getPrice();
        java.lang.String str14 = onlineBook3.open();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "(Display textbook contents here)" + "'", str14.equals("(Display textbook contents here)"));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("OnlineItem [name=, id=40, type=hi!, price=0.0, publisher=hi!]", "OnlineItem [name=, id=19, type=hi!, price=0.0, publisher=hi!]", (double) (byte) -1, "onlinebook");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setType("hi!");
        java.lang.String str6 = onlineBook3.getName();
        onlineBook3.setName("");
        onlineBook3.available = true;
        onlineBook3.setPublisher("OnlineItem [name=, id=40, type=hi!, price=0.0, publisher=hi!]");
        java.lang.String str13 = onlineBook3.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("onlinebook", (double) 10L, "hi!");
        java.lang.String str4 = onlineBook3.open();
        java.lang.String str5 = onlineBook3.getType();
        onlineBook3.setPrice((double) (short) 10);
        onlineBook3.edition = (short) -1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(Display textbook contents here)" + "'", str4.equals("(Display textbook contents here)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "onlinebook" + "'", str5.equals("onlinebook"));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("onlinebook", (double) 10L, "hi!");
        java.lang.String str4 = onlineBook3.open();
        onlineBook3.setId((int) '#');
        int int7 = onlineBook3.edition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(Display textbook contents here)" + "'", str4.equals("(Display textbook contents here)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("hi!", "", (double) '4', "hi!");
        onlineBook4.setPrice((double) (byte) -1);
        java.lang.String str7 = onlineBook4.getName();
        java.lang.String str8 = onlineBook4.toString();
        onlineBook4.setType("onlinebook");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str8 + "' != '" + "OnlineItem [name=hi!, id=98, type=onlinebook, price=-1.0, publisher=hi!]" + "'", str8.equals("OnlineItem [name=hi!, id=98, type=onlinebook, price=-1.0, publisher=hi!]"));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        york.eecs.bt.OnlineBook onlineBook4 = new york.eecs.bt.OnlineBook("OnlineItem [name=, id=40, type=hi!, price=0.0, publisher=hi!]", "hi!", 100.0d, "OnlineItem [name=, id=66, type=onlinebook, price=0.0, publisher=]");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        york.eecs.bt.OnlineBook onlineBook3 = new york.eecs.bt.OnlineBook("", (double) 0L, "hi!");
        onlineBook3.setPublisher("");
        java.lang.String str6 = onlineBook3.getType();
        onlineBook3.setPublisher("OnlineItem [name=, id=35, type=hi!, price=0.0, publisher=hi!]");
        onlineBook3.setType("OnlineItem [name=, id=18, type=onlinebook, price=0.0, publisher=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "onlinebook" + "'", str6.equals("onlinebook"));
    }
}
