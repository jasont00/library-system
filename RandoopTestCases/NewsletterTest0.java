import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewsletterTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        newsletter3.setPublisher("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setPublisher("");
        java.lang.String str10 = newsletter3.getName();
        java.lang.Class<?> wildcardClass11 = newsletter3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]", (double) (-1), "");
        java.lang.Class<?> wildcardClass4 = newsletter3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=13, type=newsletter, price=-1.0, publisher=hi!]", (double) 100.0f, "OnlineItem [name=, id=32, type=hi!, price=-1.0, publisher=hi!]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setRentable((java.lang.Boolean) true);
        newsletter3.setRentable((java.lang.Boolean) false);
        java.lang.String str12 = newsletter3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=40, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=40, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str12 + "' != '" + "OnlineItem [name=OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!], id=40, type=newsletter, price=-1.0, publisher=hi!]" + "'", str12.equals("OnlineItem [name=OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!], id=40, type=newsletter, price=-1.0, publisher=hi!]"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        int int6 = newsletter3.getId();
        java.lang.String str7 = newsletter3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=50, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=50, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        java.lang.String str6 = newsletter3.getOwner();
        java.lang.String str7 = newsletter3.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        java.lang.String str6 = newsletter3.getType();
        boolean boolean7 = newsletter3.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=58, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=58, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "newsletter" + "'", str6.equals("newsletter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setOwner("OnlineItem [name=, id=12, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str13 = newsletter3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=59, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=59, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "newsletter" + "'", str13.equals("newsletter"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setType("hi!");
        java.lang.String str6 = newsletter3.toString();
        newsletter3.setOwner("OnlineItem [name=, id=50, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "OnlineItem [name=, id=63, type=hi!, price=-1.0, publisher=hi!]" + "'", str6.equals("OnlineItem [name=, id=63, type=hi!, price=-1.0, publisher=hi!]"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=28, type=newsletter, price=-1.0, publisher=hi!]", (double) 0, "OnlineItem [name=, id=42, type=newsletter, price=-1.0, publisher=hi!]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setRentable((java.lang.Boolean) true);
        newsletter3.setId((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=71, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=71, type=newsletter, price=-1.0, publisher=hi!]"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setOwner("OnlineItem [name=, id=12, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=73, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=73, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        java.lang.String str6 = newsletter3.getType();
        newsletter3.setId(30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "newsletter" + "'", str6.equals("newsletter"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.Class<?> wildcardClass8 = newsletter3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=75, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=75, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setType("hi!");
        newsletter3.setType("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        java.lang.String str6 = newsletter3.getType();
        newsletter3.setOwner("OnlineItem [name=, id=30, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setId((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "newsletter" + "'", str6.equals("newsletter"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.open();
        java.lang.String str5 = newsletter3.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str4.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setRentable((java.lang.Boolean) true);
        java.lang.String str6 = newsletter3.getPublisher();
        int int7 = newsletter3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 80 + "'", int7 == 80);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str11 = newsletter3.getPublisher();
        java.lang.String str12 = newsletter3.open();
        newsletter3.setId((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=83, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=83, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str12.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setOwner("OnlineItem [name=, id=12, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setPrice((double) (byte) -1);
        java.lang.String str15 = newsletter3.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=85, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=85, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setName("OnlineItem [name=, id=19, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str6 = newsletter3.open();
        java.lang.String str7 = newsletter3.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str6.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setType("hi!");
        newsletter3.setId((int) (byte) -1);
        java.lang.String str8 = newsletter3.getPublisher();
        int int9 = newsletter3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setRentable((java.lang.Boolean) true);
        newsletter3.setRentable((java.lang.Boolean) false);
        boolean boolean12 = newsletter3.getRentable();
        newsletter3.setOwner("OnlineItem [name=, id=29, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=89, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=89, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setType("hi!");
        newsletter3.setId((int) (byte) -1);
        java.lang.String str8 = newsletter3.getName();
        boolean boolean9 = newsletter3.getRentable();
        java.lang.Class<?> wildcardClass10 = newsletter3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("hi!", 1.0d, "OnlineItem [name=, id=9, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setId(30);
        java.lang.String str6 = newsletter3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        java.lang.String str6 = newsletter3.getType();
        int int7 = newsletter3.getId();
        double double8 = newsletter3.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "newsletter" + "'", str6.equals("newsletter"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 92 + "'", int7 == 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str11 = newsletter3.getPublisher();
        java.lang.String str12 = newsletter3.open();
        java.lang.String str13 = newsletter3.getName();
        newsletter3.setType("OnlineItem [name=, id=94, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=96, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=96, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str12.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]" + "'", str13.equals("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]", (double) (-1), "");
        java.lang.String str4 = newsletter3.open();
        newsletter3.setOwner("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str7 = newsletter3.getName();
        java.lang.Class<?> wildcardClass8 = newsletter3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str4.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]" + "'", str7.equals("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str11 = newsletter3.getPublisher();
        double double12 = newsletter3.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=101, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=101, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getOwner();
        newsletter3.setName("OnlineItem [name=, id=45, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("hi!", 1.0d, "OnlineItem [name=, id=9, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setId(30);
        java.lang.String str6 = newsletter3.open();
        newsletter3.setId((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str6.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]", (double) (-1), "");
        java.lang.String str4 = newsletter3.open();
        newsletter3.setOwner("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.Class<?> wildcardClass7 = newsletter3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str4.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setName("OnlineItem [name=, id=19, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str6 = newsletter3.open();
        java.lang.String str7 = newsletter3.open();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str6.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str7.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.Class<?> wildcardClass11 = newsletter3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=108, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=108, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str11 = newsletter3.getPublisher();
        java.lang.String str12 = newsletter3.open();
        java.lang.String str13 = newsletter3.getPublisher();
        newsletter3.setId(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=110, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=110, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str12.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=25, type=newsletter, price=-1.0, publisher=hi!]", (double) 1, "OnlineItem [name=, id=96, type=newsletter, price=-1.0, publisher=hi!]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean11 = newsletter3.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=115, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=115, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setOwner("OnlineItem [name=, id=12, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setPrice((double) (byte) -1);
        java.lang.Class<?> wildcardClass15 = newsletter3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=118, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=118, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setType("hi!");
        newsletter3.setId((int) (byte) -1);
        java.lang.String str8 = newsletter3.getName();
        boolean boolean9 = newsletter3.getRentable();
        java.lang.String str10 = newsletter3.getOwner();
        java.lang.String str11 = newsletter3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        java.lang.String str6 = newsletter3.getType();
        int int7 = newsletter3.getId();
        newsletter3.setId((-1));
        newsletter3.setRentable((java.lang.Boolean) true);
        java.lang.String str12 = newsletter3.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "newsletter" + "'", str6.equals("newsletter"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 121 + "'", int7 == 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        java.lang.String str6 = newsletter3.getType();
        java.lang.String str7 = newsletter3.getOwner();
        newsletter3.setPublisher("OnlineItem [name=, id=89, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "newsletter" + "'", str6.equals("newsletter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("hi!", 1.0d, "OnlineItem [name=, id=9, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setId(30);
        java.lang.String str6 = newsletter3.open();
        newsletter3.setRentable((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str6.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setRentable((java.lang.Boolean) true);
        newsletter3.setPublisher("OnlineItem [name=, id=45, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setRentable((java.lang.Boolean) true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setOwner("OnlineItem [name=, id=12, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setRentable((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=129, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=129, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        java.lang.String str6 = newsletter3.getType();
        newsletter3.setType("OnlineItem [name=, id=59, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "newsletter" + "'", str6.equals("newsletter"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        java.lang.String str6 = newsletter3.getName();
        java.lang.String str7 = newsletter3.open();
        java.lang.String str8 = newsletter3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=132, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=132, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str7.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "newsletter" + "'", str8.equals("newsletter"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.open();
        newsletter3.setType("newsletter");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str4.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        newsletter3.setPublisher("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setPublisher("");
        java.lang.String str10 = newsletter3.getName();
        newsletter3.setId((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=59, type=newsletter, price=-1.0, publisher=hi!]", (double) (byte) 0, "OnlineItem [name=OnlineItem [name=, id=85, type=newsletter, price=-1.0, publisher=hi!], id=116, type=newsletter, price=-1.0, publisher=hi!]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setType("hi!");
        java.lang.String str6 = newsletter3.open();
        newsletter3.setPublisher("OnlineItem [name=, id=30, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str6.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]", (double) (-1), "");
        java.lang.String str4 = newsletter3.open();
        java.lang.String str5 = newsletter3.getType();
        java.lang.String str6 = newsletter3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str4.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "newsletter" + "'", str5.equals("newsletter"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "OnlineItem [name=OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!], id=139, type=newsletter, price=-1.0, publisher=]" + "'", str6.equals("OnlineItem [name=OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!], id=139, type=newsletter, price=-1.0, publisher=]"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        newsletter3.setRentable((java.lang.Boolean) false);
        java.lang.String str7 = newsletter3.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        int int6 = newsletter3.getId();
        newsletter3.setRentable((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=143, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=143, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 143 + "'", int6 == 143);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        java.lang.String str6 = newsletter3.getOwner();
        newsletter3.setId((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str11 = newsletter3.getType();
        newsletter3.setName("OnlineItem [name=, id=85, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str14 = newsletter3.toString();
        newsletter3.setPrice((double) 136);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=145, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=145, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "newsletter" + "'", str11.equals("newsletter"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str14 + "' != '" + "OnlineItem [name=OnlineItem [name=, id=85, type=newsletter, price=-1.0, publisher=hi!], id=145, type=newsletter, price=-1.0, publisher=hi!]" + "'", str14.equals("OnlineItem [name=OnlineItem [name=, id=85, type=newsletter, price=-1.0, publisher=hi!], id=145, type=newsletter, price=-1.0, publisher=hi!]"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]", (double) (-1), "");
        java.lang.String str4 = newsletter3.open();
        newsletter3.setRentable((java.lang.Boolean) false);
        java.lang.String str7 = newsletter3.open();
        java.lang.Class<?> wildcardClass8 = newsletter3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str4.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str7.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setRentable((java.lang.Boolean) true);
        newsletter3.setRentable((java.lang.Boolean) false);
        newsletter3.setOwner("OnlineItem [name=, id=13, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.Class<?> wildcardClass14 = newsletter3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=148, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=148, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        java.lang.String str6 = newsletter3.getName();
        java.lang.String str7 = newsletter3.open();
        double double8 = newsletter3.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=149, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=149, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str7.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setOwner("OnlineItem [name=, id=12, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setName("OnlineItem [name=OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!], id=40, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=150, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=150, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setType("hi!");
        newsletter3.setId((int) (byte) -1);
        java.lang.String str8 = newsletter3.getName();
        java.lang.String str9 = newsletter3.getPublisher();
        newsletter3.setRentable((java.lang.Boolean) true);
        newsletter3.setType("OnlineItem [name=, id=60, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setType("hi!");
        newsletter3.setId((int) (byte) -1);
        newsletter3.setRentable((java.lang.Boolean) false);
        double double10 = newsletter3.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        java.lang.String str6 = newsletter3.getType();
        int int7 = newsletter3.getId();
        newsletter3.setId((-1));
        newsletter3.setRentable((java.lang.Boolean) true);
        newsletter3.setOwner("OnlineItem [name=, id=73, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "newsletter" + "'", str6.equals("newsletter"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 154 + "'", int7 == 154);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]", (double) (-1), "");
        java.lang.String str4 = newsletter3.open();
        newsletter3.setRentable((java.lang.Boolean) false);
        java.lang.String str7 = newsletter3.open();
        java.lang.String str8 = newsletter3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str4.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str7.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str8 + "' != '" + "OnlineItem [name=OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!], id=155, type=newsletter, price=-1.0, publisher=]" + "'", str8.equals("OnlineItem [name=OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!], id=155, type=newsletter, price=-1.0, publisher=]"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        java.lang.String str9 = newsletter3.getPublisher();
        int int10 = newsletter3.getId();
        java.lang.String str11 = newsletter3.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=157, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=157, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 157 + "'", int10 == 157);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setName("OnlineItem [name=, id=19, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str6 = newsletter3.open();
        java.lang.String str7 = newsletter3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str6.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "OnlineItem [name=, id=19, type=newsletter, price=-1.0, publisher=hi!]" + "'", str7.equals("OnlineItem [name=, id=19, type=newsletter, price=-1.0, publisher=hi!]"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        java.lang.String str6 = newsletter3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "OnlineItem [name=, id=159, type=newsletter, price=-1.0, publisher=hi!]" + "'", str6.equals("OnlineItem [name=, id=159, type=newsletter, price=-1.0, publisher=hi!]"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setRentable((java.lang.Boolean) true);
        newsletter3.setRentable((java.lang.Boolean) false);
        java.lang.String str12 = newsletter3.getPublisher();
        java.lang.String str13 = newsletter3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=160, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=160, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]" + "'", str13.equals("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        int int4 = newsletter3.getId();
        newsletter3.setRentable((java.lang.Boolean) false);
        java.lang.String str7 = newsletter3.getType();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 161 + "'", int4 == 161);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "newsletter" + "'", str7.equals("newsletter"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str11 = newsletter3.getType();
        newsletter3.setName("OnlineItem [name=, id=85, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setOwner("OnlineItem [name=, id=63, type=hi!, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=162, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=162, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "newsletter" + "'", str11.equals("newsletter"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("hi!", 1.0d, "OnlineItem [name=, id=9, type=newsletter, price=-1.0, publisher=hi!]");
        int int4 = newsletter3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 164 + "'", int4 == 164);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        java.lang.String str6 = newsletter3.getType();
        newsletter3.setOwner("OnlineItem [name=, id=30, type=newsletter, price=-1.0, publisher=hi!]");
        double double9 = newsletter3.getPrice();
        newsletter3.setName("OnlineItem [name=, id=113, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "newsletter" + "'", str6.equals("newsletter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]", (double) (-1), "");
        java.lang.String str4 = newsletter3.getType();
        newsletter3.setName("OnlineItem [name=, id=150, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "newsletter" + "'", str4.equals("newsletter"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setRentable((java.lang.Boolean) true);
        java.lang.String str6 = newsletter3.getPublisher();
        java.lang.String str7 = newsletter3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "OnlineItem [name=, id=167, type=newsletter, price=-1.0, publisher=hi!]" + "'", str7.equals("OnlineItem [name=, id=167, type=newsletter, price=-1.0, publisher=hi!]"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setType("hi!");
        newsletter3.setType("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setOwner("OnlineItem [name=, id=157, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]", (double) (-1), "");
        java.lang.String str4 = newsletter3.open();
        java.lang.String str5 = newsletter3.getType();
        boolean boolean6 = newsletter3.getRentable();
        java.lang.String str7 = newsletter3.open();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str4.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "newsletter" + "'", str5.equals("newsletter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str7.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setType("hi!");
        newsletter3.setId((int) (byte) -1);
        java.lang.String str8 = newsletter3.getName();
        boolean boolean9 = newsletter3.getRentable();
        java.lang.String str10 = newsletter3.getOwner();
        newsletter3.setRentable((java.lang.Boolean) false);
        int int13 = newsletter3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]", (double) (-1), "");
        java.lang.String str4 = newsletter3.open();
        newsletter3.setRentable((java.lang.Boolean) false);
        newsletter3.setPublisher("OnlineItem [name=, id=9, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setPublisher("OnlineItem [name=, id=148, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str11 = newsletter3.open();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str4.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str11.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        java.lang.String str6 = newsletter3.getOwner();
        newsletter3.setPublisher("");
        newsletter3.setPrice(10.0d);
        java.lang.String str11 = newsletter3.getPublisher();
        newsletter3.setPublisher("OnlineItem [name=, id=94, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=13, type=newsletter, price=-1.0, publisher=hi!]", (double) 43, "OnlineItem [name=, id=149, type=newsletter, price=-1.0, publisher=hi!]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setOwner("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setId(24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=174, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=174, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        java.lang.String str6 = newsletter3.getType();
        int int7 = newsletter3.getId();
        java.lang.String str8 = newsletter3.getType();
        java.lang.Class<?> wildcardClass9 = newsletter3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "newsletter" + "'", str6.equals("newsletter"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 175 + "'", int7 == 175);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "newsletter" + "'", str8.equals("newsletter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=60, type=newsletter, price=-1.0, publisher=hi!]", 100.0d, "OnlineItem [name=OnlineItem [name=, id=85, type=newsletter, price=-1.0, publisher=hi!], id=145, type=newsletter, price=-1.0, publisher=hi!]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        java.lang.String str9 = newsletter3.getPublisher();
        newsletter3.setPrice(1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=177, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=177, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getOwner();
        newsletter3.setRentable((java.lang.Boolean) true);
        java.lang.String str7 = newsletter3.open();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str7.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("hi!", 1.0d, "OnlineItem [name=, id=9, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setPrice(0.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("hi!", 1.0d, "OnlineItem [name=, id=9, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setId(30);
        java.lang.String str6 = newsletter3.open();
        double double7 = newsletter3.getPrice();
        newsletter3.setRentable((java.lang.Boolean) true);
        newsletter3.setPrice((double) 143);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str6.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]", (double) (-1), "");
        java.lang.String str4 = newsletter3.getType();
        newsletter3.setRentable((java.lang.Boolean) true);
        java.lang.String str7 = newsletter3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "newsletter" + "'", str4.equals("newsletter"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "OnlineItem [name=OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!], id=182, type=newsletter, price=-1.0, publisher=]" + "'", str7.equals("OnlineItem [name=OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!], id=182, type=newsletter, price=-1.0, publisher=]"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        java.lang.String str6 = newsletter3.getName();
        java.lang.String str7 = newsletter3.open();
        newsletter3.setPublisher("OnlineItem [name=, id=17, type=newsletter, price=-1.0, publisher=hi!]");
        int int10 = newsletter3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=183, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=183, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str7.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 183 + "'", int10 == 183);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        newsletter3.setPublisher("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str8 = newsletter3.open();
        int int9 = newsletter3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str8.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 184 + "'", int9 == 184);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=57, type=newsletter, price=-1.0, publisher=hi!]", (double) '#', "OnlineItem [name=, id=174, type=newsletter, price=-1.0, publisher=hi!]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setType("hi!");
        java.lang.String str6 = newsletter3.open();
        newsletter3.setId(175);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str6.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setType("hi!");
        newsletter3.setId((int) (byte) -1);
        newsletter3.setRentable((java.lang.Boolean) false);
        java.lang.String str10 = newsletter3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str8 = newsletter3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=188, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=188, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str8 + "' != '" + "OnlineItem [name=OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!], id=188, type=newsletter, price=-1.0, publisher=hi!]" + "'", str8.equals("OnlineItem [name=OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!], id=188, type=newsletter, price=-1.0, publisher=hi!]"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        newsletter3.setName("OnlineItem [name=, id=10, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str11 = newsletter3.getPublisher();
        int int12 = newsletter3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=189, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=189, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 189 + "'", int12 == 189);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]", (double) (-1), "");
        java.lang.String str4 = newsletter3.getType();
        boolean boolean5 = newsletter3.getRentable();
        newsletter3.setOwner("OnlineItem [name=, id=148, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "newsletter" + "'", str4.equals("newsletter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        int int4 = newsletter3.getId();
        java.lang.String str5 = newsletter3.toString();
        double double6 = newsletter3.getPrice();
        newsletter3.setOwner("OnlineItem [name=, id=132, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 191 + "'", int4 == 191);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=191, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=191, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        newsletter3.setPublisher("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setRentable((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.open();
        double double5 = newsletter3.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str4.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.toString();
        newsletter3.setName("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        boolean boolean8 = newsletter3.getRentable();
        java.lang.String str9 = newsletter3.getPublisher();
        newsletter3.setRentable((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "OnlineItem [name=, id=194, type=newsletter, price=-1.0, publisher=hi!]" + "'", str5.equals("OnlineItem [name=, id=194, type=newsletter, price=-1.0, publisher=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        newsletter3.setPublisher("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setPublisher("");
        newsletter3.setName("OnlineItem [name=, id=28, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str12 = newsletter3.getPublisher();
        newsletter3.setPrice((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("hi!", 1.0d, "OnlineItem [name=, id=9, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setId(30);
        newsletter3.setRentable((java.lang.Boolean) false);
        newsletter3.setPrice((double) 154);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        java.lang.String str4 = newsletter3.getName();
        java.lang.String str5 = newsletter3.getPublisher();
        newsletter3.setPublisher("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        newsletter3.setPublisher("");
        newsletter3.setName("OnlineItem [name=, id=28, type=newsletter, price=-1.0, publisher=hi!]");
        java.lang.String str12 = newsletter3.getName();
        newsletter3.setPublisher("OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "OnlineItem [name=, id=28, type=newsletter, price=-1.0, publisher=hi!]" + "'", str12.equals("OnlineItem [name=, id=28, type=newsletter, price=-1.0, publisher=hi!]"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("OnlineItem [name=, id=162, type=newsletter, price=-1.0, publisher=hi!]", (double) 143, "OnlineItem [name=OnlineItem [name=, id=3, type=newsletter, price=-1.0, publisher=hi!], id=182, type=newsletter, price=-1.0, publisher=]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        york.eecs.bt.Newsletter newsletter3 = new york.eecs.bt.Newsletter("", (double) (-1L), "hi!");
        newsletter3.setRentable((java.lang.Boolean) true);
        java.lang.String str6 = newsletter3.getType();
        java.lang.String str7 = newsletter3.open();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "newsletter" + "'", str6.equals("newsletter"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation" + "'", str7.equals("SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation"));
    }
}
