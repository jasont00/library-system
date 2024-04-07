import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PhysicalItemTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        java.lang.String str2 = physicalItem0.getType();
        java.lang.String str3 = physicalItem0.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        york.eecs.bt.PhysicalItem physicalItem3 = new york.eecs.bt.PhysicalItem("Physical Item [name=null, id=0, type=, price=0.0]", 1.0d, false);
        boolean boolean4 = physicalItem3.getRented();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        york.eecs.bt.PhysicalItem physicalItem3 = new york.eecs.bt.PhysicalItem("Physical Item [name=null, id=0, type=null, price=0.0]", (double) 0, false);
        physicalItem3.setType("hi!");
        physicalItem3.setOwner("Physical Item [name=null, id=0, type=, price=0.0]");
        java.lang.Class<?> wildcardClass8 = physicalItem3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setName("hi!");
        java.lang.String str8 = physicalItem0.getOwner();
        java.lang.String str9 = physicalItem0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str8.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Physical Item [name=hi!, id=0, type=, price=0.0]" + "'", str9.equals("Physical Item [name=hi!, id=0, type=, price=0.0]"));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        physicalItem0.setPrice((double) (byte) 1);
        physicalItem0.setName("");
        int int12 = physicalItem0.getId();
        physicalItem0.setRented(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        york.eecs.bt.PhysicalItem physicalItem3 = new york.eecs.bt.PhysicalItem("Physical Item [name=null, id=0, type=null, price=0.0]", (double) 0, false);
        physicalItem3.setType("hi!");
        physicalItem3.setOwner("Physical Item [name=null, id=0, type=, price=0.0]");
        java.lang.String str8 = physicalItem3.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        york.eecs.bt.PhysicalItem physicalItem3 = new york.eecs.bt.PhysicalItem("Physical Item [name=null, id=0, type=null, price=0.0]", (double) 0, false);
        java.lang.String str4 = physicalItem3.getName();
        boolean boolean5 = physicalItem3.getRented();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str4.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        york.eecs.bt.PhysicalItem physicalItem3 = new york.eecs.bt.PhysicalItem("Physical Item [name=hi!, id=0, type=, price=0.0]", (double) (byte) 10, false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        york.eecs.bt.PhysicalItem physicalItem3 = new york.eecs.bt.PhysicalItem("Physical Item [name=null, id=0, type=null, price=0.0]", (double) 0, false);
        physicalItem3.setType("Physical Item [name=null, id=0, type=null, price=0.0]");
        java.lang.String str6 = physicalItem3.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        java.lang.String str8 = physicalItem0.toString();
        physicalItem0.setPrice((double) '4');
        physicalItem0.setPrice((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Physical Item [name=null, id=0, type=, price=0.0]" + "'", str8.equals("Physical Item [name=null, id=0, type=, price=0.0]"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        physicalItem0.setRented(true);
        physicalItem0.setOwner("");
        boolean boolean12 = physicalItem0.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setName("hi!");
        physicalItem0.setPrice(10.0d);
        physicalItem0.setOwner("");
        boolean boolean12 = physicalItem0.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        physicalItem0.setPrice((double) (byte) 1);
        physicalItem0.setName("");
        physicalItem0.setOwner("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        york.eecs.bt.PhysicalItem physicalItem3 = new york.eecs.bt.PhysicalItem("Physical Item [name=null, id=0, type=null, price=0.0]", (double) 0, false);
        physicalItem3.setType("hi!");
        java.lang.String str6 = physicalItem3.getType();
        physicalItem3.setId((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        java.lang.String str8 = physicalItem0.toString();
        java.lang.String str9 = physicalItem0.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Physical Item [name=null, id=0, type=, price=0.0]" + "'", str8.equals("Physical Item [name=null, id=0, type=, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        java.lang.String str4 = physicalItem0.getName();
        java.lang.String str5 = physicalItem0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        boolean boolean1 = physicalItem0.getRented();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        physicalItem0.setPrice((double) (byte) 1);
        double double10 = physicalItem0.getPrice();
        double double11 = physicalItem0.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        york.eecs.bt.PhysicalItem physicalItem3 = new york.eecs.bt.PhysicalItem("Physical Item [name=hi!, id=0, type=, price=0.0]", (double) 10L, false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        physicalItem0.setPrice((double) (byte) 1);
        physicalItem0.setName("");
        int int12 = physicalItem0.getId();
        java.lang.String str13 = physicalItem0.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        physicalItem0.setPrice((double) (byte) 1);
        java.lang.String str10 = physicalItem0.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        physicalItem0.setPrice((double) (byte) 1);
        physicalItem0.setName("");
        boolean boolean12 = physicalItem0.getRentable();
        physicalItem0.setRentable((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        java.lang.String str4 = physicalItem0.getName();
        java.lang.String str5 = physicalItem0.getOwner();
        java.lang.String str6 = physicalItem0.toString();
        physicalItem0.setName("Physical Item [name=hi!, id=0, type=, price=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str5.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str6.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        java.lang.String str8 = physicalItem0.toString();
        int int9 = physicalItem0.getId();
        boolean boolean10 = physicalItem0.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Physical Item [name=null, id=0, type=, price=0.0]" + "'", str8.equals("Physical Item [name=null, id=0, type=, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        york.eecs.bt.PhysicalItem physicalItem3 = new york.eecs.bt.PhysicalItem("Physical Item [name=null, id=0, type=null, price=0.0]", (double) 0, false);
        physicalItem3.setType("hi!");
        physicalItem3.setId((int) '#');
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setName("");
        int int8 = physicalItem0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        physicalItem0.setPrice((double) (byte) 1);
        physicalItem0.setName("");
        int int12 = physicalItem0.getId();
        physicalItem0.setName("Physical Item [name=null, id=0, type=null, price=0.0]");
        boolean boolean15 = physicalItem0.getRentable();
        physicalItem0.setId((int) (short) 10);
        physicalItem0.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setName("hi!");
        physicalItem0.setPrice(10.0d);
        physicalItem0.setId((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        boolean boolean8 = physicalItem0.getRented();
        java.lang.Class<?> wildcardClass9 = physicalItem0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        york.eecs.bt.PhysicalItem physicalItem3 = new york.eecs.bt.PhysicalItem("Physical Item [name=null, id=0, type=null, price=0.0]", (double) 0, false);
        physicalItem3.setType("hi!");
        java.lang.String str6 = physicalItem3.getType();
        physicalItem3.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        java.lang.String str4 = physicalItem0.getName();
        java.lang.String str5 = physicalItem0.getOwner();
        physicalItem0.setId(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str5.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        java.lang.String str4 = physicalItem0.getName();
        java.lang.String str5 = physicalItem0.getOwner();
        java.lang.String str6 = physicalItem0.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str5.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str6.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        physicalItem0.setPrice(1.0d);
        java.lang.String str10 = physicalItem0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        java.lang.String str8 = physicalItem0.toString();
        physicalItem0.setPrice((double) '4');
        physicalItem0.setRentable((java.lang.Boolean) false);
        int int13 = physicalItem0.getId();
        physicalItem0.setName("");
        double double16 = physicalItem0.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Physical Item [name=null, id=0, type=, price=0.0]" + "'", str8.equals("Physical Item [name=null, id=0, type=, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setName("hi!");
        java.lang.String str8 = physicalItem0.getOwner();
        physicalItem0.setRentable((java.lang.Boolean) false);
        physicalItem0.setId((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str8.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        physicalItem0.setPrice(1.0d);
        physicalItem0.setType("");
        physicalItem0.setOwner("Physical Item [name=hi!, id=0, type=, price=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        java.lang.String str8 = physicalItem0.toString();
        physicalItem0.setPrice((double) '4');
        physicalItem0.setRentable((java.lang.Boolean) false);
        int int13 = physicalItem0.getId();
        physicalItem0.setName("");
        physicalItem0.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Physical Item [name=null, id=0, type=, price=0.0]" + "'", str8.equals("Physical Item [name=null, id=0, type=, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setName("hi!");
        physicalItem0.setRentable((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setName("hi!");
        physicalItem0.setPrice(10.0d);
        java.lang.String str10 = physicalItem0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        physicalItem0.setPrice((double) (byte) 1);
        physicalItem0.setName("");
        java.lang.Class<?> wildcardClass12 = physicalItem0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        physicalItem0.setPrice((double) (byte) 1);
        physicalItem0.setName("");
        int int12 = physicalItem0.getId();
        physicalItem0.setName("Physical Item [name=null, id=0, type=null, price=0.0]");
        boolean boolean15 = physicalItem0.getRentable();
        physicalItem0.setId((int) (short) 10);
        java.lang.String str18 = physicalItem0.getPublisher();
        double double19 = physicalItem0.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        physicalItem0.setPrice((double) (byte) 1);
        boolean boolean10 = physicalItem0.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setName("hi!");
        boolean boolean8 = physicalItem0.getRented();
        boolean boolean9 = physicalItem0.getRentable();
        java.lang.String str10 = physicalItem0.getOwner();
        int int11 = physicalItem0.getId();
        physicalItem0.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str10.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        york.eecs.bt.PhysicalItem physicalItem3 = new york.eecs.bt.PhysicalItem("Physical Item [name=null, id=0, type=null, price=0.0]", (double) 0, false);
        physicalItem3.setType("Physical Item [name=null, id=0, type=null, price=0.0]");
        java.lang.String str6 = physicalItem3.getName();
        physicalItem3.setType("Physical Item [name=hi!, id=0, type=, price=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str6.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        physicalItem0.setPrice((double) (byte) 1);
        physicalItem0.setName("");
        int int12 = physicalItem0.getId();
        physicalItem0.setName("Physical Item [name=null, id=0, type=null, price=0.0]");
        boolean boolean15 = physicalItem0.getRentable();
        physicalItem0.setId((int) (short) 10);
        java.lang.String str18 = physicalItem0.getPublisher();
        physicalItem0.setId((int) (byte) -1);
        physicalItem0.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        java.lang.String str8 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=, price=0.0]");
        boolean boolean11 = physicalItem0.getRentable();
        java.lang.Class<?> wildcardClass12 = physicalItem0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Physical Item [name=null, id=0, type=, price=0.0]" + "'", str8.equals("Physical Item [name=null, id=0, type=, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        java.lang.String str8 = physicalItem0.toString();
        physicalItem0.setPrice((double) '4');
        physicalItem0.setRentable((java.lang.Boolean) false);
        int int13 = physicalItem0.getId();
        physicalItem0.setName("");
        java.lang.String str16 = physicalItem0.getName();
        java.lang.String str17 = physicalItem0.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Physical Item [name=null, id=0, type=, price=0.0]" + "'", str8.equals("Physical Item [name=null, id=0, type=, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        york.eecs.bt.PhysicalItem physicalItem0 = new york.eecs.bt.PhysicalItem();
        java.lang.String str1 = physicalItem0.toString();
        physicalItem0.setOwner("Physical Item [name=null, id=0, type=null, price=0.0]");
        physicalItem0.setType("");
        physicalItem0.setOwner("");
        java.lang.String str8 = physicalItem0.toString();
        physicalItem0.setPrice((double) '4');
        double double11 = physicalItem0.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Physical Item [name=null, id=0, type=null, price=0.0]" + "'", str1.equals("Physical Item [name=null, id=0, type=null, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Physical Item [name=null, id=0, type=, price=0.0]" + "'", str8.equals("Physical Item [name=null, id=0, type=, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }
}

