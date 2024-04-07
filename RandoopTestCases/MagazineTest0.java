import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MagazineTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        magazine3.setName("Physical Item [name=, id=3, type=magazine, price=-1.0]");
        magazine3.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=12, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=12, type=magazine, price=-1.0]"));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        magazine3.setName("");
        java.lang.String str9 = magazine3.getOwner();
        java.lang.String str10 = magazine3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        magazine3.setName("Physical Item [name=, id=3, type=magazine, price=-1.0]");
        java.lang.String str8 = magazine3.getPublisher();
        java.lang.String str9 = magazine3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=25, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=25, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "magazine" + "'", str9.equals("magazine"));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("Physical Item [name=, id=3, type=magazine, price=-1.0]", (double) (-1), false);
        java.lang.Class<?> wildcardClass4 = magazine3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        java.lang.String str7 = magazine3.getOwner();
        magazine3.setRented(false);
        boolean boolean10 = magazine3.getRented();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("Physical Item [name=, id=12, type=magazine, price=-1.0]", (double) 1.0f, false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("Physical Item [name=, id=10, type=magazine, price=-1.0]");
        java.lang.String str7 = magazine3.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Physical Item [name=, id=10, type=magazine, price=-1.0]" + "'", str7.equals("Physical Item [name=, id=10, type=magazine, price=-1.0]"));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        magazine3.setName("Physical Item [name=, id=3, type=magazine, price=-1.0]");
        java.lang.String str8 = magazine3.getPublisher();
        magazine3.setPrice((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=38, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=38, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        magazine3.setType("hi!");
        magazine3.setId((int) (byte) -1);
        boolean boolean8 = magazine3.getRented();
        boolean boolean9 = magazine3.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "magazine" + "'", str5.equals("magazine"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("hi!", 1.0d, false);
        boolean boolean4 = magazine3.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        magazine3.setName("");
        java.lang.String str9 = magazine3.getOwner();
        java.lang.String str10 = magazine3.getOwner();
        magazine3.setOwner("Physical Item [name=, id=10, type=magazine, price=-1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        java.lang.String str7 = magazine3.getName();
        magazine3.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        magazine3.setType("hi!");
        magazine3.setId((int) (byte) -1);
        boolean boolean8 = magazine3.getRented();
        magazine3.setId((int) 'a');
        boolean boolean11 = magazine3.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("Physical Item [name=, id=3, type=magazine, price=-1.0]", (double) (-1), false);
        boolean boolean4 = magazine3.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        magazine3.setType("hi!");
        magazine3.setId((int) (byte) -1);
        magazine3.setName("Physical Item [name=, id=25, type=magazine, price=-1.0]");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        java.lang.String str7 = magazine3.getOwner();
        magazine3.setRented(false);
        magazine3.setOwner("Physical Item [name=, id=13, type=magazine, price=-1.0]");
        magazine3.setId(40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("Physical Item [name=, id=3, type=magazine, price=-1.0]", (double) (-1), false);
        java.lang.String str4 = magazine3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Physical Item [name=, id=3, type=magazine, price=-1.0]" + "'", str4.equals("Physical Item [name=, id=3, type=magazine, price=-1.0]"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        magazine3.setName("Physical Item [name=, id=3, type=magazine, price=-1.0]");
        java.lang.String str8 = magazine3.getPublisher();
        magazine3.setName("Physical Item [name=, id=10, type=magazine, price=-1.0]");
        magazine3.setRentable((java.lang.Boolean) false);
        java.lang.String str13 = magazine3.getType();
        magazine3.setRentable((java.lang.Boolean) false);
        boolean boolean16 = magazine3.getRented();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=58, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=58, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "magazine" + "'", str13.equals("magazine"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        java.lang.String str7 = magazine3.getName();
        magazine3.setPrice(0.0d);
        double double10 = magazine3.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("hi!", 1.0d, false);
        java.lang.String str4 = magazine3.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        java.lang.String str7 = magazine3.getName();
        magazine3.setName("Physical Item [name=, id=63, type=hi!, price=-1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        magazine3.setName("Physical Item [name=, id=3, type=magazine, price=-1.0]");
        java.lang.String str8 = magazine3.getPublisher();
        magazine3.setName("Physical Item [name=, id=10, type=magazine, price=-1.0]");
        magazine3.setOwner("hi!");
        boolean boolean13 = magazine3.getRentable();
        boolean boolean14 = magazine3.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=65, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=65, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("Physical Item [name=, id=65, type=magazine, price=-1.0]", 100.0d, false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        int int6 = magazine3.getId();
        java.lang.String str7 = magazine3.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=67, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=67, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 67 + "'", int6 == 67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        int int6 = magazine3.getId();
        magazine3.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=68, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=68, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 68 + "'", int6 == 68);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        int int6 = magazine3.getId();
        int int7 = magazine3.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=70, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=70, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        java.lang.String str7 = magazine3.getName();
        magazine3.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        magazine3.setType("hi!");
        java.lang.String str6 = magazine3.toString();
        int int7 = magazine3.getId();
        magazine3.setId(56);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Physical Item [name=, id=72, type=hi!, price=-1.0]" + "'", str6.equals("Physical Item [name=, id=72, type=hi!, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 72 + "'", int7 == 72);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        magazine3.setName("");
        int int9 = magazine3.getId();
        java.lang.String str10 = magazine3.getPublisher();
        magazine3.setName("Physical Item [name=, id=26, type=magazine, price=-1.0]");
        java.lang.String str13 = magazine3.getOwner();
        java.lang.Class<?> wildcardClass14 = magazine3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 73 + "'", int9 == 73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        magazine3.setType("hi!");
        magazine3.setId((int) (byte) -1);
        boolean boolean8 = magazine3.getRented();
        magazine3.setId((int) 'a');
        magazine3.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        magazine3.setName("");
        java.lang.String str9 = magazine3.getOwner();
        java.lang.String str10 = magazine3.getOwner();
        magazine3.setId(68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        magazine3.setName("Physical Item [name=, id=3, type=magazine, price=-1.0]");
        java.lang.String str8 = magazine3.getPublisher();
        boolean boolean9 = magazine3.getRented();
        java.lang.String str10 = magazine3.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=76, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=76, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        java.lang.String str7 = magazine3.getName();
        boolean boolean8 = magazine3.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        magazine3.setType("hi!");
        java.lang.String str6 = magazine3.toString();
        magazine3.setRentable((java.lang.Boolean) false);
        int int9 = magazine3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Physical Item [name=, id=78, type=hi!, price=-1.0]" + "'", str6.equals("Physical Item [name=, id=78, type=hi!, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 78 + "'", int9 == 78);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        magazine3.setType("hi!");
        magazine3.setId((int) (byte) -1);
        java.lang.String str8 = magazine3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        java.lang.String str7 = magazine3.getOwner();
        magazine3.setId(70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        int int6 = magazine3.getId();
        java.lang.String str7 = magazine3.getName();
        magazine3.setOwner("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=83, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=83, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 83 + "'", int6 == 83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("Physical Item [name=, id=3, type=magazine, price=-1.0]", (double) (-1), false);
        magazine3.setType("Physical Item [name=, id=68, type=magazine, price=-1.0]");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        magazine3.setName("");
        java.lang.String str9 = magazine3.getPublisher();
        magazine3.setRentable((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("Physical Item [name=, id=10, type=magazine, price=-1.0]");
        java.lang.String str7 = magazine3.getName();
        java.lang.String str8 = magazine3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        magazine3.setName("Physical Item [name=, id=3, type=magazine, price=-1.0]");
        java.lang.String str8 = magazine3.getPublisher();
        magazine3.setName("Physical Item [name=, id=10, type=magazine, price=-1.0]");
        magazine3.setRentable((java.lang.Boolean) false);
        java.lang.String str13 = magazine3.getType();
        java.lang.String str14 = magazine3.getPublisher();
        java.lang.Class<?> wildcardClass15 = magazine3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=87, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=87, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "magazine" + "'", str13.equals("magazine"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        java.lang.String str7 = magazine3.getOwner();
        magazine3.setRented(false);
        double double10 = magazine3.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("Physical Item [name=, id=49, type=magazine, price=-1.0]", (double) 29, false);
        magazine3.setId((int) (short) 10);
        boolean boolean6 = magazine3.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        boolean boolean6 = magazine3.getRented();
        magazine3.setOwner("Physical Item [name=, id=9, type=magazine, price=-1.0]");
        magazine3.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=91, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=91, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        magazine3.setOwner("");
        java.lang.String str7 = magazine3.getName();
        magazine3.setPrice(0.0d);
        magazine3.setId((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        int int6 = magazine3.getId();
        double double7 = magazine3.getPrice();
        java.lang.String str8 = magazine3.getName();
        magazine3.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=94, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=94, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("Physical Item [name=, id=49, type=magazine, price=-1.0]", (double) 29, false);
        java.lang.Class<?> wildcardClass4 = magazine3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        magazine3.setName("Physical Item [name=, id=3, type=magazine, price=-1.0]");
        java.lang.String str8 = magazine3.getPublisher();
        java.lang.String str9 = magazine3.getOwner();
        double double10 = magazine3.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=97, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=97, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        magazine3.setName("Physical Item [name=, id=3, type=magazine, price=-1.0]");
        java.lang.String str8 = magazine3.getPublisher();
        magazine3.setName("Physical Item [name=, id=10, type=magazine, price=-1.0]");
        magazine3.setType("Physical Item [name=, id=70, type=magazine, price=-1.0]");
        magazine3.setRentable((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=98, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=98, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        york.eecs.bt.Magazine magazine3 = new york.eecs.bt.Magazine("", (double) (-1L), false);
        java.lang.String str4 = magazine3.getName();
        java.lang.String str5 = magazine3.toString();
        magazine3.setName("Physical Item [name=, id=3, type=magazine, price=-1.0]");
        java.lang.String str8 = magazine3.getPublisher();
        magazine3.setName("Physical Item [name=, id=10, type=magazine, price=-1.0]");
        magazine3.setRentable((java.lang.Boolean) false);
        magazine3.setName("Physical Item [name=, id=98, type=magazine, price=-1.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=, id=99, type=magazine, price=-1.0]" + "'", str5.equals("Physical Item [name=, id=99, type=magazine, price=-1.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }
}
