import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TextbookTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("(Display textbook contents here)", (double) ' ', 4);
        int int4 = textbook3.getId();
        boolean boolean5 = textbook3.getRentable();
        java.lang.String str6 = textbook3.getPublisher();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "N/A" + "'", str6.equals("N/A"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        java.lang.String str3 = textbook2.getOwner();
        boolean boolean4 = textbook2.getRentable();
        int int5 = textbook2.edition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        java.lang.String str3 = textbook2.getOwner();
        java.lang.String str4 = textbook2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Physical Item [name=hi!, id=24, type=textbook, price=35.0]" + "'", str4.equals("Physical Item [name=hi!, id=24, type=textbook, price=35.0]"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        java.lang.String str3 = textbook2.getOwner();
        boolean boolean4 = textbook2.getRentable();
        boolean boolean5 = textbook2.available;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        java.lang.String str3 = textbook2.open();
        boolean boolean4 = textbook2.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(Display textbook contents here)" + "'", str3.equals("(Display textbook contents here)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("Physical Item [name=N/A, id=30, type=textbook, price=-1.0]", 0.0d);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("(Display textbook contents here)", (double) ' ', 4);
        int int4 = textbook3.getId();
        boolean boolean5 = textbook3.getRentable();
        boolean boolean6 = textbook3.available;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        java.lang.String str3 = textbook2.getOwner();
        boolean boolean4 = textbook2.getRentable();
        java.lang.String str5 = textbook2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=hi!, id=57, type=textbook, price=35.0]" + "'", str5.equals("Physical Item [name=hi!, id=57, type=textbook, price=35.0]"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("", (double) 1, (int) (short) 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        textbook2.setRented(true);
        int int5 = textbook2.getId();
        java.lang.Class<?> wildcardClass6 = textbook2.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        java.lang.String str3 = textbook2.getOwner();
        textbook2.setOwner("");
        java.lang.Class<?> wildcardClass6 = textbook2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        boolean boolean6 = textbook2.getRented();
        textbook2.setRented(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        java.lang.String str3 = textbook2.toString();
        textbook2.setRented(true);
        boolean boolean6 = textbook2.available;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Physical Item [name=N/A, id=70, type=textbook, price=-1.0]" + "'", str3.equals("Physical Item [name=N/A, id=70, type=textbook, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.setRented(true);
        java.lang.String str5 = textbook2.getPublisher();
        boolean boolean6 = textbook2.available;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        java.lang.String str3 = textbook2.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Physical Item [name=, id=72, type=textbook, price=-1.0]" + "'", str3.equals("Physical Item [name=, id=72, type=textbook, price=-1.0]"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        java.lang.String str3 = textbook2.toString();
        java.lang.String str4 = textbook2.getType();
        boolean boolean5 = textbook2.available;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Physical Item [name=N/A, id=76, type=textbook, price=-1.0]" + "'", str3.equals("Physical Item [name=N/A, id=76, type=textbook, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "textbook" + "'", str4.equals("textbook"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        java.lang.String str3 = textbook2.getOwner();
        java.lang.String str4 = textbook2.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "textbook" + "'", str4.equals("textbook"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        textbook2.setRented(false);
        java.lang.String str8 = textbook2.getOwner();
        textbook2.setName("Physical Item [name=, id=72, type=textbook, price=-1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        textbook2.setOwner("Physical Item [name=N/A, id=66, type=textbook, price=-1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        int int3 = textbook2.getId();
        textbook2.available = false;
        textbook2.setPrice((double) (-1));
        java.lang.String str8 = textbook2.getOwner();
        textbook2.setName("N/A");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 84 + "'", int3 == 84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        java.lang.String str3 = textbook2.getOwner();
        textbook2.setOwner("");
        int int6 = textbook2.edition;
        textbook2.setRentable((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass9 = textbook2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        textbook2.setType("Physical Item [name=, id=72, type=textbook, price=-1.0]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        textbook2.setRented(true);
        boolean boolean5 = textbook2.available;
        int int6 = textbook2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 88 + "'", int6 == 88);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("Physical Item [name=N/A, id=70, type=textbook, price=-1.0]", (double) 42, 18);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=91, type=textbook, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=91, type=textbook, price=-1.0]"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        java.lang.String str3 = textbook2.getOwner();
        textbook2.setOwner("");
        boolean boolean6 = textbook2.getRented();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("Physical Item [name=N/A, id=36, type=textbook, price=-1.0]", (double) 56, (int) (byte) 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("(Display textbook contents here)", (double) ' ', 4);
        int int4 = textbook3.getId();
        boolean boolean5 = textbook3.getRentable();
        int int6 = textbook3.edition;
        java.lang.String str7 = textbook3.getPublisher();
        textbook3.setName("Physical Item [name=N/A, id=66, type=textbook, price=-1.0]");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        int int3 = textbook2.getId();
        boolean boolean4 = textbook2.available;
        textbook2.setType("hi!");
        textbook2.edition = 13;
        textbook2.setRented(true);
        textbook2.setType("Physical Item [name=N/A, id=30, type=textbook, price=-1.0]");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 104 + "'", int3 == 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        textbook2.setRented(true);
        textbook2.setPrice((double) 0L);
        textbook2.setPrice((double) 8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("Physical Item [name=N/A, id=76, type=textbook, price=-1.0]", (double) 61);
        java.lang.Class<?> wildcardClass3 = textbook2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        java.lang.String str3 = textbook2.toString();
        java.lang.String str4 = textbook2.getType();
        java.lang.String str5 = textbook2.getType();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Physical Item [name=N/A, id=108, type=textbook, price=-1.0]" + "'", str3.equals("Physical Item [name=N/A, id=108, type=textbook, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "textbook" + "'", str4.equals("textbook"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "textbook" + "'", str5.equals("textbook"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        textbook2.setRented(false);
        java.lang.String str8 = textbook2.getOwner();
        textbook2.setId((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("textbook", 0.0d, 13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        int int3 = textbook2.getId();
        boolean boolean4 = textbook2.available;
        textbook2.setType("hi!");
        textbook2.edition = 100;
        boolean boolean9 = textbook2.getRented();
        java.lang.String str10 = textbook2.getOwner();
        int int11 = textbook2.edition;
        double double12 = textbook2.getPrice();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 113 + "'", int3 == 113);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        textbook2.setRented(false);
        textbook2.setId((-1));
        textbook2.edition = (short) 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        textbook2.setType("Physical Item [name=N/A, id=65, type=textbook, price=-1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.setRented(true);
        textbook2.setRented(true);
        java.lang.String str7 = textbook2.getName();
        boolean boolean8 = textbook2.available;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        int int3 = textbook2.edition;
        textbook2.setId((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        java.lang.String str6 = textbook2.getOwner();
        int int7 = textbook2.edition;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        textbook2.setRented(true);
        boolean boolean5 = textbook2.available;
        textbook2.setType("Physical Item [name=N/A, id=30, type=textbook, price=-1.0]");
        textbook2.edition = 38;
        textbook2.setOwner("Physical Item [name=hi!, id=99, type=textbook, price=35.0]");
        textbook2.setOwner("");
        textbook2.setOwner("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        java.lang.String str3 = textbook2.open();
        java.lang.String str4 = textbook2.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(Display textbook contents here)" + "'", str3.equals("(Display textbook contents here)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        textbook2.available = false;
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 42;
        textbook2.setRented(true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        int int3 = textbook2.getId();
        boolean boolean4 = textbook2.available;
        java.lang.String str5 = textbook2.toString();
        boolean boolean6 = textbook2.getRented();
        boolean boolean7 = textbook2.getRented();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 127 + "'", int3 == 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=hi!, id=127, type=textbook, price=35.0]" + "'", str5.equals("Physical Item [name=hi!, id=127, type=textbook, price=35.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.setRented(true);
        textbook2.setRented(true);
        java.lang.String str7 = textbook2.getOwner();
        textbook2.edition = (byte) 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("(Display textbook contents here)", (double) ' ', 4);
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.open();
        textbook3.setRented(true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 130 + "'", int4 == 130);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(Display textbook contents here)" + "'", str5.equals("(Display textbook contents here)"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        textbook2.setRented(false);
        double double8 = textbook2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        java.lang.String str3 = textbook2.toString();
        textbook2.setRented(true);
        textbook2.setOwner("");
        boolean boolean8 = textbook2.available;
        textbook2.available = true;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Physical Item [name=N/A, id=133, type=textbook, price=-1.0]" + "'", str3.equals("Physical Item [name=N/A, id=133, type=textbook, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        java.lang.String str3 = textbook2.getOwner();
        boolean boolean4 = textbook2.getRentable();
        textbook2.available = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("Physical Item [name=hi!, id=24, type=textbook, price=35.0]", (double) 100L, (int) (short) -1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.setRented(true);
        java.lang.String str5 = textbook2.getPublisher();
        textbook2.edition = 88;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        int int3 = textbook2.getId();
        boolean boolean4 = textbook2.available;
        textbook2.setType("hi!");
        textbook2.edition = 100;
        boolean boolean9 = textbook2.getRented();
        int int10 = textbook2.edition;
        int int11 = textbook2.edition;
        boolean boolean12 = textbook2.available;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 143 + "'", int3 == 143);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("Physical Item [name=N/A, id=76, type=textbook, price=-1.0]", (double) 56, 41);
        textbook3.setType("Physical Item [name=N/A, id=133, type=textbook, price=-1.0]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("(Display textbook contents here)", (double) ' ', 4);
        textbook3.setName("(Display textbook contents here)");
        double double6 = textbook3.getPrice();
        boolean boolean7 = textbook3.getRented();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("Physical Item [name=N/A, id=52, type=textbook, price=-1.0]", (double) 1L);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.setRentable((java.lang.Boolean) false);
        boolean boolean5 = textbook2.getRented();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("Physical Item [name=hi!, id=57, type=textbook, price=35.0]", (double) (short) 0);
        double double3 = textbook2.getPrice();
        boolean boolean4 = textbook2.available;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        int int3 = textbook2.getId();
        textbook2.available = false;
        textbook2.setPrice((double) (-1));
        java.lang.String str8 = textbook2.getOwner();
        textbook2.setName("Physical Item [name=N/A, id=65, type=textbook, price=-1.0]");
        java.lang.Class<?> wildcardClass11 = textbook2.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 149 + "'", int3 == 149);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("Physical Item [name=N/A, id=52, type=textbook, price=-1.0]", (double) (-1), 127);
        java.lang.Class<?> wildcardClass4 = textbook3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        java.lang.String str3 = textbook2.getOwner();
        textbook2.setOwner("");
        int int6 = textbook2.edition;
        java.lang.String str7 = textbook2.getPublisher();
        java.lang.String str8 = textbook2.toString();
        textbook2.setType("(Display textbook contents here)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Physical Item [name=hi!, id=151, type=textbook, price=35.0]" + "'", str8.equals("Physical Item [name=hi!, id=151, type=textbook, price=35.0]"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        textbook2.setRented(true);
        java.lang.String str5 = textbook2.getPublisher();
        int int6 = textbook2.getId();
        textbook2.available = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 153 + "'", int6 == 153);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("(Display textbook contents here)", (double) ' ', 4);
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.getOwner();
        textbook3.edition = 41;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 154 + "'", int4 == 154);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("Physical Item [name=N/A, id=76, type=textbook, price=-1.0]", (double) 14);
        java.lang.String str3 = textbook2.getOwner();
        boolean boolean4 = textbook2.getRented();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 42;
        textbook2.setId(56);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        int int3 = textbook2.getId();
        boolean boolean4 = textbook2.available;
        textbook2.setType("hi!");
        textbook2.edition = 100;
        boolean boolean9 = textbook2.getRented();
        int int10 = textbook2.edition;
        textbook2.setRented(false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 159 + "'", int3 == 159);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        int int3 = textbook2.getId();
        boolean boolean4 = textbook2.available;
        textbook2.setType("hi!");
        textbook2.edition = 13;
        java.lang.String str9 = textbook2.getOwner();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 160 + "'", int3 == 160);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        int int3 = textbook2.edition;
        textbook2.setType("Physical Item [name=hi!, id=9, type=textbook, price=35.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        int int3 = textbook2.getId();
        textbook2.available = false;
        textbook2.setPrice((double) (-1));
        java.lang.String str8 = textbook2.getOwner();
        textbook2.available = true;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 162 + "'", int3 == 162);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("Physical Item [name=N/A, id=36, type=textbook, price=-1.0]", 1.0d, (int) (short) -1);
        boolean boolean4 = textbook3.available;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.setRentable((java.lang.Boolean) false);
        textbook2.setName("Physical Item [name=hi!, id=116, type=textbook, price=35.0]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("(Display textbook contents here)", (double) ' ', 4);
        int int4 = textbook3.getId();
        java.lang.String str5 = textbook3.toString();
        boolean boolean6 = textbook3.getRentable();
        textbook3.setPrice((double) 143);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 165 + "'", int4 == 165);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=(Display textbook contents here), id=165, type=textbook, price=32.0]" + "'", str5.equals("Physical Item [name=(Display textbook contents here), id=165, type=textbook, price=32.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("Physical Item [name=N/A, id=108, type=textbook, price=-1.0]", (double) (-1), 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("Physical Item [name=N/A, id=76, type=textbook, price=-1.0]", (double) 14);
        boolean boolean3 = textbook2.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        int int3 = textbook2.getId();
        boolean boolean4 = textbook2.available;
        textbook2.setType("Physical Item [name=hi!, id=24, type=textbook, price=35.0]");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 168 + "'", int3 == 168);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        textbook2.setRented(false);
        java.lang.String str8 = textbook2.getOwner();
        java.lang.String str9 = textbook2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Physical Item [name=, id=170, type=textbook, price=-1.0]" + "'", str9.equals("Physical Item [name=, id=170, type=textbook, price=-1.0]"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        java.lang.String str3 = textbook2.getOwner();
        textbook2.setOwner("");
        int int6 = textbook2.edition;
        java.lang.String str7 = textbook2.getPublisher();
        textbook2.edition = 127;
        double double10 = textbook2.getPrice();
        textbook2.setId(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("Physical Item [name=hi!, id=99, type=textbook, price=35.0]", (double) 98);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("textbook", (double) 62);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        textbook2.setRented(false);
        textbook2.setId((-1));
        textbook2.setRentable((java.lang.Boolean) false);
        textbook2.setRented(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("Physical Item [name=hi!, id=169, type=textbook, price=35.0]", (double) 0.0f, 51);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("Physical Item [name=hi!, id=57, type=textbook, price=35.0]", (double) (short) 0);
        java.lang.String str3 = textbook2.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "N/A" + "'", str3.equals("N/A"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        textbook2.setRented(false);
        textbook2.available = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        textbook2.setRented(false);
        java.lang.String str8 = textbook2.getOwner();
        java.lang.String str9 = textbook2.getName();
        java.lang.Class<?> wildcardClass10 = textbook2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        java.lang.String str3 = textbook2.open();
        java.lang.String str4 = textbook2.open();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(Display textbook contents here)" + "'", str3.equals("(Display textbook contents here)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(Display textbook contents here)" + "'", str4.equals("(Display textbook contents here)"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        textbook2.setRented(false);
        textbook2.setId((-1));
        textbook2.setRentable((java.lang.Boolean) false);
        textbook2.available = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("N/A", (double) 1L, (int) (short) 100);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        int int3 = textbook2.getId();
        boolean boolean4 = textbook2.available;
        textbook2.setType("hi!");
        textbook2.edition = 100;
        boolean boolean9 = textbook2.getRented();
        boolean boolean10 = textbook2.getRented();
        textbook2.available = true;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 184 + "'", int3 == 184);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        textbook2.setRented(true);
        boolean boolean5 = textbook2.available;
        textbook2.setType("Physical Item [name=N/A, id=30, type=textbook, price=-1.0]");
        textbook2.edition = 38;
        textbook2.setOwner("Physical Item [name=hi!, id=99, type=textbook, price=35.0]");
        java.lang.String str12 = textbook2.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "N/A" + "'", str12.equals("N/A"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        textbook2.setRented(false);
        java.lang.String str8 = textbook2.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "textbook" + "'", str8.equals("textbook"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("Physical Item [name=N/A, id=30, type=textbook, price=-1.0]", (double) (short) -1, (int) (short) -1);
        java.lang.String str4 = textbook3.toString();
        textbook3.setName("Physical Item [name=hi!, id=116, type=textbook, price=35.0]");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Physical Item [name=Physical Item [name=N/A, id=30, type=textbook, price=-1.0], id=187, type=textbook, price=-1.0]" + "'", str4.equals("Physical Item [name=Physical Item [name=N/A, id=30, type=textbook, price=-1.0], id=187, type=textbook, price=-1.0]"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        java.lang.String str3 = textbook2.getOwner();
        textbook2.setOwner("");
        int int6 = textbook2.edition;
        double double7 = textbook2.getPrice();
        textbook2.setPrice((double) 100L);
        textbook2.setRented(false);
        textbook2.setId(98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 9;
        java.lang.String str5 = textbook2.getPublisher();
        textbook2.setRented(false);
        textbook2.setRented(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "N/A" + "'", str5.equals("N/A"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        java.lang.String str3 = textbook2.getOwner();
        textbook2.setOwner("");
        int int6 = textbook2.edition;
        java.lang.String str7 = textbook2.getPublisher();
        java.lang.String str8 = textbook2.toString();
        textbook2.available = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "N/A" + "'", str7.equals("N/A"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Physical Item [name=hi!, id=190, type=textbook, price=35.0]" + "'", str8.equals("Physical Item [name=hi!, id=190, type=textbook, price=35.0]"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        textbook2.setRented(true);
        textbook2.setType("Physical Item [name=(Display textbook contents here), id=152, type=textbook, price=32.0]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("hi!", (double) '#');
        java.lang.String str3 = textbook2.getOwner();
        textbook2.setOwner("");
        int int6 = textbook2.edition;
        textbook2.setRentable((java.lang.Boolean) false);
        java.lang.String str9 = textbook2.toString();
        textbook2.setOwner("Physical Item [name=N/A, id=76, type=textbook, price=-1.0]");
        java.lang.String str12 = textbook2.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Physical Item [name=hi!, id=192, type=textbook, price=35.0]" + "'", str9.equals("Physical Item [name=hi!, id=192, type=textbook, price=35.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Physical Item [name=N/A, id=76, type=textbook, price=-1.0]" + "'", str12.equals("Physical Item [name=N/A, id=76, type=textbook, price=-1.0]"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("Physical Item [name=hi!, id=57, type=textbook, price=35.0]", (double) 56, (int) (byte) -1);
        java.lang.String str4 = textbook3.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        textbook2.edition = 42;
        double double5 = textbook2.getPrice();
        java.lang.String str6 = textbook2.getType();
        double double7 = textbook2.getPrice();
        java.lang.String str8 = textbook2.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "textbook" + "'", str6.equals("textbook"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("", (-1.0d));
        java.lang.String str3 = textbook2.getName();
        textbook2.available = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        int int3 = textbook2.edition;
        java.lang.String str4 = textbook2.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "N/A" + "'", str4.equals("N/A"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        textbook2.setRented(true);
        boolean boolean5 = textbook2.available;
        textbook2.setRented(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        york.eecs.bt.Textbook textbook2 = new york.eecs.bt.Textbook("N/A", (double) (-1L));
        java.lang.String str3 = textbook2.toString();
        java.lang.String str4 = textbook2.getName();
        textbook2.edition = 4;
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Physical Item [name=N/A, id=199, type=textbook, price=-1.0]" + "'", str3.equals("Physical Item [name=N/A, id=199, type=textbook, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "N/A" + "'", str4.equals("N/A"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        york.eecs.bt.Textbook textbook3 = new york.eecs.bt.Textbook("Physical Item [name=Physical Item [name=N/A, id=30, type=textbook, price=-1.0], id=187, type=textbook, price=-1.0]", (double) 100L, 153);
        textbook3.setName("Physical Item [name=N/A, id=30, type=textbook, price=-1.0]");
    }
}
