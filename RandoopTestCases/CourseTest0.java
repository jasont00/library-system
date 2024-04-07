import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseTest0 {

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
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        java.lang.Class<?> wildcardClass6 = textbookList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.lang.Class<?> wildcardClass5 = course4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        course4.setCode("hi!");
        java.lang.Class<?> wildcardClass7 = course4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook textbook6 = null;
        course4.addTextbook(textbook6);
        york.eecs.bt.Textbook[] textbookArray9 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList10 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList10, textbookArray9);
        york.eecs.bt.Course course12 = new york.eecs.bt.Course("hi!", textbookList10);
        york.eecs.bt.Textbook[] textbookArray14 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList15 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList15, textbookArray14);
        york.eecs.bt.Course course17 = new york.eecs.bt.Course("hi!", textbookList15);
        course12.setTextbooks(textbookList15);
        course4.setTextbooks(textbookList15);
        java.lang.String str20 = course4.getName();
        course4.setCode("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        york.eecs.bt.Textbook[] textbookArray19 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList20, textbookArray19);
        york.eecs.bt.Course course22 = new york.eecs.bt.Course("hi!", textbookList20);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = course22.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray25 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList26 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList26, textbookArray25);
        york.eecs.bt.Course course28 = new york.eecs.bt.Course("hi!", textbookList26);
        york.eecs.bt.Textbook[] textbookArray30 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList31 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList31, textbookArray30);
        york.eecs.bt.Course course33 = new york.eecs.bt.Course("hi!", textbookList31);
        course28.setTextbooks(textbookList31);
        course22.setTextbooks(textbookList31);
        course4.setTextbooks(textbookList31);
        course4.setCode("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        java.lang.String str18 = course4.getName();
        course4.setName("");
        york.eecs.bt.Textbook textbook21 = null;
        course4.addTextbook(textbook21);
        java.lang.String str23 = course4.printDetails();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Name:  Code: null" + "'", str23.equals("Name:  Code: null"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook textbook6 = null;
        course4.addTextbook(textbook6);
        york.eecs.bt.Textbook[] textbookArray9 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList10 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList10, textbookArray9);
        york.eecs.bt.Course course12 = new york.eecs.bt.Course("hi!", textbookList10);
        york.eecs.bt.Textbook[] textbookArray14 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList15 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList15, textbookArray14);
        york.eecs.bt.Course course17 = new york.eecs.bt.Course("hi!", textbookList15);
        course12.setTextbooks(textbookList15);
        course4.setTextbooks(textbookList15);
        java.lang.String str20 = course4.getName();
        java.lang.Class<?> wildcardClass21 = course4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        course4.setCode("hi!");
        course4.setCode("");
        java.lang.Class<?> wildcardClass9 = course4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        york.eecs.bt.Textbook[] textbookArray18 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList19 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList19, textbookArray18);
        york.eecs.bt.Course course21 = new york.eecs.bt.Course("hi!", textbookList19);
        course4.setTextbooks(textbookList19);
        java.lang.String str23 = course4.getName();
        york.eecs.bt.Textbook textbook24 = null;
        course4.addTextbook(textbook24);
        java.lang.String str26 = course4.printDetails();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Name: hi! Code: null" + "'", str26.equals("Name: hi! Code: null"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            york.eecs.bt.Course course2 = new york.eecs.bt.Course("Name:  Code: null", textbookList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("hi!", "");
        york.eecs.bt.Textbook[] textbookArray4 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList5, textbookArray4);
        york.eecs.bt.Course course7 = new york.eecs.bt.Course("hi!", textbookList5);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = course7.getTextbooks();
        york.eecs.bt.Textbook textbook9 = null;
        course7.addTextbook(textbook9);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        york.eecs.bt.Textbook[] textbookArray17 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList18 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList18, textbookArray17);
        york.eecs.bt.Course course20 = new york.eecs.bt.Course("hi!", textbookList18);
        course15.setTextbooks(textbookList18);
        course7.setTextbooks(textbookList18);
        course2.setTextbooks(textbookList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("hi!", "Name:  Code: null");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        java.lang.String str11 = course4.getCode();
        course4.setCode("");
        java.lang.Class<?> wildcardClass14 = course4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("", textbookList3);
        york.eecs.bt.Textbook[] textbookArray8 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList9 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList9, textbookArray8);
        york.eecs.bt.Course course11 = new york.eecs.bt.Course("hi!", textbookList9);
        york.eecs.bt.Textbook[] textbookArray13 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList14 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList14, textbookArray13);
        york.eecs.bt.Course course16 = new york.eecs.bt.Course("hi!", textbookList14);
        course11.setTextbooks(textbookList14);
        course6.setTextbooks(textbookList14);
        java.lang.String str19 = course6.getCode();
        york.eecs.bt.Textbook[] textbookArray21 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList22 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList22, textbookArray21);
        york.eecs.bt.Course course24 = new york.eecs.bt.Course("hi!", textbookList22);
        york.eecs.bt.Textbook[] textbookArray26 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList27 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList27, textbookArray26);
        york.eecs.bt.Course course29 = new york.eecs.bt.Course("hi!", textbookList27);
        course24.setTextbooks(textbookList27);
        york.eecs.bt.Textbook[] textbookArray32 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList33 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList33, textbookArray32);
        york.eecs.bt.Course course35 = new york.eecs.bt.Course("hi!", textbookList33);
        course24.setTextbooks(textbookList33);
        course24.setCode("");
        york.eecs.bt.Textbook[] textbookArray41 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList42 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList42, textbookArray41);
        york.eecs.bt.Course course44 = new york.eecs.bt.Course("hi!", textbookList42);
        course44.setCode("hi!");
        course44.setCode("");
        york.eecs.bt.Textbook[] textbookArray50 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList51 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList51, textbookArray50);
        york.eecs.bt.Course course53 = new york.eecs.bt.Course("hi!", textbookList51);
        york.eecs.bt.Textbook[] textbookArray55 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList56 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList56, textbookArray55);
        york.eecs.bt.Course course58 = new york.eecs.bt.Course("hi!", textbookList56);
        course53.setTextbooks(textbookList56);
        york.eecs.bt.Textbook[] textbookArray61 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList62 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList62, textbookArray61);
        york.eecs.bt.Course course64 = new york.eecs.bt.Course("hi!", textbookList62);
        course53.setTextbooks(textbookList62);
        java.lang.String str66 = course53.getCode();
        york.eecs.bt.Textbook[] textbookArray68 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList69 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList69, textbookArray68);
        york.eecs.bt.Course course71 = new york.eecs.bt.Course("hi!", textbookList69);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList72 = course71.getTextbooks();
        course53.setTextbooks(textbookList72);
        course44.setTextbooks(textbookList72);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList75 = course44.getTextbooks();
        york.eecs.bt.Course course76 = new york.eecs.bt.Course("Name:  Code: null", textbookList75);
        course24.setTextbooks(textbookList75);
        course6.setTextbooks(textbookList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList75);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        course4.setCode("hi!");
        course4.setCode("");
        java.lang.String str9 = course4.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        york.eecs.bt.Textbook[] textbookArray19 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList20, textbookArray19);
        york.eecs.bt.Course course22 = new york.eecs.bt.Course("hi!", textbookList20);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = course22.getTextbooks();
        course4.setTextbooks(textbookList23);
        java.lang.String str25 = course4.getName();
        java.lang.Class<?> wildcardClass26 = course4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        york.eecs.bt.Textbook[] textbookArray19 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList20, textbookArray19);
        york.eecs.bt.Course course22 = new york.eecs.bt.Course("hi!", textbookList20);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = course22.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray25 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList26 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList26, textbookArray25);
        york.eecs.bt.Course course28 = new york.eecs.bt.Course("hi!", textbookList26);
        york.eecs.bt.Textbook[] textbookArray30 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList31 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList31, textbookArray30);
        york.eecs.bt.Course course33 = new york.eecs.bt.Course("hi!", textbookList31);
        course28.setTextbooks(textbookList31);
        course22.setTextbooks(textbookList31);
        course4.setTextbooks(textbookList31);
        java.lang.Class<?> wildcardClass37 = textbookList31.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("Name:  Code: null", "hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        york.eecs.bt.Textbook[] textbookArray19 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList20, textbookArray19);
        york.eecs.bt.Course course22 = new york.eecs.bt.Course("hi!", textbookList20);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = course22.getTextbooks();
        course4.setTextbooks(textbookList23);
        york.eecs.bt.Textbook textbook25 = null;
        course4.addTextbook(textbook25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        java.lang.Class<?> wildcardClass11 = textbookList7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("Name: hi! Code: null", "hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook textbook6 = null;
        course4.addTextbook(textbook6);
        york.eecs.bt.Textbook[] textbookArray9 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList10 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList10, textbookArray9);
        york.eecs.bt.Course course12 = new york.eecs.bt.Course("hi!", textbookList10);
        york.eecs.bt.Textbook[] textbookArray14 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList15 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList15, textbookArray14);
        york.eecs.bt.Course course17 = new york.eecs.bt.Course("hi!", textbookList15);
        course12.setTextbooks(textbookList15);
        course4.setTextbooks(textbookList15);
        java.lang.String str20 = course4.getName();
        java.lang.String str21 = course4.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("Name:  Code: null", "Name:  Code: null");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        york.eecs.bt.Textbook[] textbookArray18 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList19 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList19, textbookArray18);
        york.eecs.bt.Course course21 = new york.eecs.bt.Course("hi!", textbookList19);
        course4.setTextbooks(textbookList19);
        course4.setName("Name: hi! Code: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook textbook11 = null;
        course4.addTextbook(textbook11);
        java.lang.Class<?> wildcardClass13 = course4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("", textbookList3);
        york.eecs.bt.Textbook[] textbookArray8 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList9 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList9, textbookArray8);
        york.eecs.bt.Course course11 = new york.eecs.bt.Course("hi!", textbookList9);
        york.eecs.bt.Textbook[] textbookArray13 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList14 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList14, textbookArray13);
        york.eecs.bt.Course course16 = new york.eecs.bt.Course("hi!", textbookList14);
        course11.setTextbooks(textbookList14);
        course6.setTextbooks(textbookList14);
        java.lang.String str19 = course6.getCode();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = course6.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray23 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList24 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList24, textbookArray23);
        york.eecs.bt.Course course26 = new york.eecs.bt.Course("hi!", textbookList24);
        york.eecs.bt.Textbook[] textbookArray28 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList29 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList29, textbookArray28);
        york.eecs.bt.Course course31 = new york.eecs.bt.Course("hi!", textbookList29);
        course26.setTextbooks(textbookList29);
        york.eecs.bt.Course course33 = new york.eecs.bt.Course("hi!", textbookList29);
        course6.setTextbooks(textbookList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        york.eecs.bt.Textbook[] textbookArray3 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList4 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList4, textbookArray3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("hi!", textbookList4);
        york.eecs.bt.Textbook[] textbookArray8 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList9 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList9, textbookArray8);
        york.eecs.bt.Course course11 = new york.eecs.bt.Course("hi!", textbookList9);
        course6.setTextbooks(textbookList9);
        york.eecs.bt.Course course13 = new york.eecs.bt.Course("", textbookList9);
        york.eecs.bt.Course course14 = new york.eecs.bt.Course("Name: hi! Code: null", textbookList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            york.eecs.bt.Course course2 = new york.eecs.bt.Course("hi!", textbookList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        course5.setTextbooks(textbookList8);
        york.eecs.bt.Textbook[] textbookArray13 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList14 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList14, textbookArray13);
        york.eecs.bt.Course course16 = new york.eecs.bt.Course("hi!", textbookList14);
        course5.setTextbooks(textbookList14);
        york.eecs.bt.Course course18 = new york.eecs.bt.Course("Name: hi! Code: ", textbookList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        java.lang.String str18 = course4.getName();
        course4.setCode("Name: hi! Code: null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        course4.setName("hi!");
        course4.setCode("Name: hi! Code: null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("hi!", "Name: hi! Code: null");
        java.lang.Class<?> wildcardClass3 = course2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        york.eecs.bt.Textbook[] textbookArray3 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList4 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList4, textbookArray3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("hi!", textbookList4);
        york.eecs.bt.Course course7 = new york.eecs.bt.Course("", textbookList4);
        york.eecs.bt.Course course8 = new york.eecs.bt.Course("hi!", textbookList4);
        java.lang.String str9 = course8.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        york.eecs.bt.Textbook[] textbookArray18 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList19 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList19, textbookArray18);
        york.eecs.bt.Course course21 = new york.eecs.bt.Course("hi!", textbookList19);
        course4.setTextbooks(textbookList19);
        course4.setCode("hi!");
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList25 = course4.getTextbooks();
        java.lang.Class<?> wildcardClass26 = course4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        java.lang.String str18 = course4.getName();
        course4.setName("");
        java.lang.Class<?> wildcardClass21 = course4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList6 = course4.getTextbooks();
        java.lang.Class<?> wildcardClass7 = course4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("hi!", "");
        java.lang.String str3 = course2.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList6 = course4.getTextbooks();
        course4.setCode("Name:  Code: null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        york.eecs.bt.Textbook[] textbookArray19 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList20, textbookArray19);
        york.eecs.bt.Course course22 = new york.eecs.bt.Course("hi!", textbookList20);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = course22.getTextbooks();
        course4.setTextbooks(textbookList23);
        java.lang.String str25 = course4.getName();
        course4.setCode("Name: hi! Code: ");
        course4.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("Name: hi! Code: null", "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("Name:  Code: null", "Name: hi! Code: ");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        york.eecs.bt.Textbook[] textbookArray4 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList5, textbookArray4);
        york.eecs.bt.Course course7 = new york.eecs.bt.Course("hi!", textbookList5);
        york.eecs.bt.Textbook[] textbookArray9 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList10 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList10, textbookArray9);
        york.eecs.bt.Course course12 = new york.eecs.bt.Course("hi!", textbookList10);
        course7.setTextbooks(textbookList10);
        york.eecs.bt.Textbook[] textbookArray15 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList16 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList16, textbookArray15);
        york.eecs.bt.Course course18 = new york.eecs.bt.Course("hi!", textbookList16);
        course7.setTextbooks(textbookList16);
        york.eecs.bt.Course course20 = new york.eecs.bt.Course("Name:  Code: null", textbookList16);
        york.eecs.bt.Course course21 = new york.eecs.bt.Course("Name: hi! Code: ", textbookList16);
        york.eecs.bt.Course course22 = new york.eecs.bt.Course("", textbookList16);
        java.lang.String str23 = course22.getCode();
        york.eecs.bt.Textbook[] textbookArray25 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList26 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList26, textbookArray25);
        york.eecs.bt.Course course28 = new york.eecs.bt.Course("hi!", textbookList26);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList29 = course28.getTextbooks();
        course22.setTextbooks(textbookList29);
        java.lang.Class<?> wildcardClass31 = textbookList29.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("hi!", "Name: hi! Code: null");
        york.eecs.bt.Textbook textbook3 = null;
        course2.addTextbook(textbook3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        java.lang.String str11 = course4.printDetails();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Name: hi! Code: null" + "'", str11.equals("Name: hi! Code: null"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        course4.setCode("hi!");
        course4.setCode("");
        java.lang.String str9 = course4.printDetails();
        course4.setCode("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Name: hi! Code: " + "'", str9.equals("Name: hi! Code: "));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("Name: hi! Code: null", "Name: hi! Code: ");
        java.lang.String str3 = course2.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Name: hi! Code: " + "'", str3.equals("Name: hi! Code: "));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("", textbookList3);
        york.eecs.bt.Textbook[] textbookArray8 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList9 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList9, textbookArray8);
        york.eecs.bt.Course course11 = new york.eecs.bt.Course("hi!", textbookList9);
        york.eecs.bt.Textbook[] textbookArray13 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList14 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList14, textbookArray13);
        york.eecs.bt.Course course16 = new york.eecs.bt.Course("hi!", textbookList14);
        course11.setTextbooks(textbookList14);
        course6.setTextbooks(textbookList14);
        java.lang.Class<?> wildcardClass19 = textbookList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        course4.setCode("");
        york.eecs.bt.Textbook[] textbookArray21 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList22 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList22, textbookArray21);
        york.eecs.bt.Course course24 = new york.eecs.bt.Course("hi!", textbookList22);
        course24.setCode("hi!");
        course24.setCode("");
        york.eecs.bt.Textbook[] textbookArray30 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList31 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList31, textbookArray30);
        york.eecs.bt.Course course33 = new york.eecs.bt.Course("hi!", textbookList31);
        york.eecs.bt.Textbook[] textbookArray35 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList36 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList36, textbookArray35);
        york.eecs.bt.Course course38 = new york.eecs.bt.Course("hi!", textbookList36);
        course33.setTextbooks(textbookList36);
        york.eecs.bt.Textbook[] textbookArray41 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList42 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList42, textbookArray41);
        york.eecs.bt.Course course44 = new york.eecs.bt.Course("hi!", textbookList42);
        course33.setTextbooks(textbookList42);
        java.lang.String str46 = course33.getCode();
        york.eecs.bt.Textbook[] textbookArray48 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList49 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList49, textbookArray48);
        york.eecs.bt.Course course51 = new york.eecs.bt.Course("hi!", textbookList49);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList52 = course51.getTextbooks();
        course33.setTextbooks(textbookList52);
        course24.setTextbooks(textbookList52);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList55 = course24.getTextbooks();
        york.eecs.bt.Course course56 = new york.eecs.bt.Course("Name:  Code: null", textbookList55);
        course4.setTextbooks(textbookList55);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList58 = course4.getTextbooks();
        java.lang.String str59 = course4.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        course4.setName("");
        course4.setName("Name: hi! Code: null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        york.eecs.bt.Textbook[] textbookArray4 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList5, textbookArray4);
        york.eecs.bt.Course course7 = new york.eecs.bt.Course("hi!", textbookList5);
        york.eecs.bt.Course course8 = new york.eecs.bt.Course("", textbookList5);
        york.eecs.bt.Textbook[] textbookArray10 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList11 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList11, textbookArray10);
        york.eecs.bt.Course course13 = new york.eecs.bt.Course("hi!", textbookList11);
        york.eecs.bt.Textbook[] textbookArray15 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList16 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList16, textbookArray15);
        york.eecs.bt.Course course18 = new york.eecs.bt.Course("hi!", textbookList16);
        course13.setTextbooks(textbookList16);
        course8.setTextbooks(textbookList16);
        java.lang.String str21 = course8.getCode();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList22 = course8.getTextbooks();
        york.eecs.bt.Course course23 = new york.eecs.bt.Course("Name:  Code: null", textbookList22);
        york.eecs.bt.Course course24 = new york.eecs.bt.Course("Name:  Code: null", textbookList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        course5.setTextbooks(textbookList8);
        york.eecs.bt.Textbook[] textbookArray13 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList14 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList14, textbookArray13);
        york.eecs.bt.Course course16 = new york.eecs.bt.Course("hi!", textbookList14);
        course5.setTextbooks(textbookList14);
        course5.setCode("");
        york.eecs.bt.Textbook[] textbookArray21 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList22 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList22, textbookArray21);
        york.eecs.bt.Course course24 = new york.eecs.bt.Course("hi!", textbookList22);
        york.eecs.bt.Textbook[] textbookArray26 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList27 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList27, textbookArray26);
        york.eecs.bt.Course course29 = new york.eecs.bt.Course("hi!", textbookList27);
        course24.setTextbooks(textbookList27);
        york.eecs.bt.Textbook[] textbookArray32 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList33 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList33, textbookArray32);
        york.eecs.bt.Course course35 = new york.eecs.bt.Course("hi!", textbookList33);
        course24.setTextbooks(textbookList33);
        java.lang.String str37 = course24.getCode();
        york.eecs.bt.Textbook[] textbookArray39 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList40 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList40, textbookArray39);
        york.eecs.bt.Course course42 = new york.eecs.bt.Course("hi!", textbookList40);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList43 = course42.getTextbooks();
        course24.setTextbooks(textbookList43);
        course5.setTextbooks(textbookList43);
        york.eecs.bt.Course course46 = new york.eecs.bt.Course("hi!", textbookList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList43);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        java.lang.String str18 = course4.getName();
        course4.setName("");
        java.lang.String str21 = course4.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        york.eecs.bt.Textbook[] textbookArray19 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList20, textbookArray19);
        york.eecs.bt.Course course22 = new york.eecs.bt.Course("hi!", textbookList20);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = course22.getTextbooks();
        course4.setTextbooks(textbookList23);
        course4.setCode("");
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList27 = course4.getTextbooks();
        york.eecs.bt.Textbook textbook28 = null;
        course4.addTextbook(textbook28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList27);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList6 = course5.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray8 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList9 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList9, textbookArray8);
        york.eecs.bt.Course course11 = new york.eecs.bt.Course("hi!", textbookList9);
        york.eecs.bt.Textbook[] textbookArray13 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList14 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList14, textbookArray13);
        york.eecs.bt.Course course16 = new york.eecs.bt.Course("hi!", textbookList14);
        course11.setTextbooks(textbookList14);
        course5.setTextbooks(textbookList14);
        java.lang.String str19 = course5.printDetails();
        java.lang.String str20 = course5.printDetails();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList21 = course5.getTextbooks();
        course5.setName("");
        york.eecs.bt.Textbook[] textbookArray25 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList26 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList26, textbookArray25);
        york.eecs.bt.Course course28 = new york.eecs.bt.Course("hi!", textbookList26);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList29 = course28.getTextbooks();
        course5.setTextbooks(textbookList29);
        york.eecs.bt.Course course31 = new york.eecs.bt.Course("Name: hi! Code: ", textbookList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Name: hi! Code: null" + "'", str19.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Name: hi! Code: null" + "'", str20.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList29);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("hi!", "");
        york.eecs.bt.Textbook textbook3 = null;
        course2.addTextbook(textbook3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course10.setTextbooks(textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str18 = course4.printDetails();
        java.lang.String str19 = course4.printDetails();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = course4.getTextbooks();
        course4.setName("");
        java.lang.String str23 = course4.getName();
        java.lang.String str24 = course4.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Name: hi! Code: null" + "'", str18.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Name: hi! Code: null" + "'", str19.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        york.eecs.bt.Textbook[] textbookArray3 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList4 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList4, textbookArray3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("hi!", textbookList4);
        york.eecs.bt.Course course7 = new york.eecs.bt.Course("", textbookList4);
        york.eecs.bt.Textbook[] textbookArray9 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList10 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList10, textbookArray9);
        york.eecs.bt.Course course12 = new york.eecs.bt.Course("hi!", textbookList10);
        york.eecs.bt.Textbook[] textbookArray14 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList15 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList15, textbookArray14);
        york.eecs.bt.Course course17 = new york.eecs.bt.Course("hi!", textbookList15);
        course12.setTextbooks(textbookList15);
        course7.setTextbooks(textbookList15);
        java.lang.String str20 = course7.getCode();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList21 = course7.getTextbooks();
        york.eecs.bt.Course course22 = new york.eecs.bt.Course("Name:  Code: null", textbookList21);
        java.lang.String str23 = course22.printDetails();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Name: Name:  Code: null Code: null" + "'", str23.equals("Name: Name:  Code: null Code: null"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course10.setTextbooks(textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str18 = course4.printDetails();
        java.lang.String str19 = course4.printDetails();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = course4.getTextbooks();
        course4.setName("");
        java.lang.String str23 = course4.getName();
        york.eecs.bt.Textbook textbook24 = null;
        course4.addTextbook(textbook24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Name: hi! Code: null" + "'", str18.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Name: hi! Code: null" + "'", str19.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        course5.setCode("hi!");
        course5.setCode("");
        york.eecs.bt.Textbook[] textbookArray11 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList12 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList12, textbookArray11);
        york.eecs.bt.Course course14 = new york.eecs.bt.Course("hi!", textbookList12);
        york.eecs.bt.Textbook[] textbookArray16 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList17 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList17, textbookArray16);
        york.eecs.bt.Course course19 = new york.eecs.bt.Course("hi!", textbookList17);
        course14.setTextbooks(textbookList17);
        york.eecs.bt.Textbook[] textbookArray22 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList23, textbookArray22);
        york.eecs.bt.Course course25 = new york.eecs.bt.Course("hi!", textbookList23);
        course14.setTextbooks(textbookList23);
        java.lang.String str27 = course14.getCode();
        york.eecs.bt.Textbook[] textbookArray29 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList30 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList30, textbookArray29);
        york.eecs.bt.Course course32 = new york.eecs.bt.Course("hi!", textbookList30);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList33 = course32.getTextbooks();
        course14.setTextbooks(textbookList33);
        course5.setTextbooks(textbookList33);
        york.eecs.bt.Course course36 = new york.eecs.bt.Course("Name: hi! Code: null", textbookList33);
        york.eecs.bt.Textbook[] textbookArray39 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList40 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList40, textbookArray39);
        york.eecs.bt.Course course42 = new york.eecs.bt.Course("hi!", textbookList40);
        york.eecs.bt.Textbook[] textbookArray44 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList45 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList45, textbookArray44);
        york.eecs.bt.Course course47 = new york.eecs.bt.Course("hi!", textbookList45);
        course42.setTextbooks(textbookList45);
        york.eecs.bt.Textbook[] textbookArray50 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList51 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList51, textbookArray50);
        york.eecs.bt.Course course53 = new york.eecs.bt.Course("hi!", textbookList51);
        course42.setTextbooks(textbookList51);
        york.eecs.bt.Course course55 = new york.eecs.bt.Course("Name:  Code: null", textbookList51);
        course36.setTextbooks(textbookList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        york.eecs.bt.Textbook[] textbookArray19 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList20, textbookArray19);
        york.eecs.bt.Course course22 = new york.eecs.bt.Course("hi!", textbookList20);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = course22.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray25 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList26 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList26, textbookArray25);
        york.eecs.bt.Course course28 = new york.eecs.bt.Course("hi!", textbookList26);
        york.eecs.bt.Textbook[] textbookArray30 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList31 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList31, textbookArray30);
        york.eecs.bt.Course course33 = new york.eecs.bt.Course("hi!", textbookList31);
        course28.setTextbooks(textbookList31);
        course22.setTextbooks(textbookList31);
        course4.setTextbooks(textbookList31);
        java.lang.String str37 = course4.printDetails();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Name: hi! Code: null" + "'", str37.equals("Name: hi! Code: null"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        york.eecs.bt.Textbook[] textbookArray18 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList19 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList19, textbookArray18);
        york.eecs.bt.Course course21 = new york.eecs.bt.Course("hi!", textbookList19);
        course4.setTextbooks(textbookList19);
        java.lang.String str23 = course4.getName();
        york.eecs.bt.Textbook textbook24 = null;
        course4.addTextbook(textbook24);
        york.eecs.bt.Textbook textbook26 = null;
        course4.addTextbook(textbook26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        course4.setCode("hi!");
        course4.setCode("");
        course4.setCode("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("", textbookList3);
        york.eecs.bt.Textbook[] textbookArray8 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList9 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList9, textbookArray8);
        york.eecs.bt.Course course11 = new york.eecs.bt.Course("hi!", textbookList9);
        york.eecs.bt.Textbook[] textbookArray13 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList14 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList14, textbookArray13);
        york.eecs.bt.Course course16 = new york.eecs.bt.Course("hi!", textbookList14);
        course11.setTextbooks(textbookList14);
        course6.setTextbooks(textbookList14);
        course6.setCode("Name: hi! Code: null");
        java.lang.String str21 = course6.getName();
        york.eecs.bt.Textbook textbook22 = null;
        course6.addTextbook(textbook22);
        course6.setCode("Name: hi! Code: ");
        java.lang.String str26 = course6.getName();
        course6.setCode("hi!");
        java.lang.String str29 = course6.printDetails();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Name:  Code: hi!" + "'", str29.equals("Name:  Code: hi!"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course10.setTextbooks(textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str18 = course4.printDetails();
        java.lang.String str19 = course4.printDetails();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = course4.getTextbooks();
        york.eecs.bt.Textbook textbook21 = null;
        course4.addTextbook(textbook21);
        java.lang.String str23 = course4.getCode();
        course4.setName("Name: hi! Code: ");
        java.lang.Class<?> wildcardClass26 = course4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Name: hi! Code: null" + "'", str18.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Name: hi! Code: null" + "'", str19.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("", "Name: hi! Code: ");
        york.eecs.bt.Textbook[] textbookArray4 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList5, textbookArray4);
        york.eecs.bt.Course course7 = new york.eecs.bt.Course("hi!", textbookList5);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = course7.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray10 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList11 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList11, textbookArray10);
        york.eecs.bt.Course course13 = new york.eecs.bt.Course("hi!", textbookList11);
        york.eecs.bt.Textbook[] textbookArray15 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList16 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList16, textbookArray15);
        york.eecs.bt.Course course18 = new york.eecs.bt.Course("hi!", textbookList16);
        course13.setTextbooks(textbookList16);
        course7.setTextbooks(textbookList16);
        java.lang.String str21 = course7.printDetails();
        java.lang.String str22 = course7.printDetails();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = course7.getTextbooks();
        course7.setName("");
        york.eecs.bt.Textbook[] textbookArray27 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList28 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList28, textbookArray27);
        york.eecs.bt.Course course30 = new york.eecs.bt.Course("hi!", textbookList28);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList31 = course30.getTextbooks();
        course7.setTextbooks(textbookList31);
        course2.setTextbooks(textbookList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Name: hi! Code: null" + "'", str21.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Name: hi! Code: null" + "'", str22.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList31);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        york.eecs.bt.Textbook[] textbookArray18 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList19 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList19, textbookArray18);
        york.eecs.bt.Course course21 = new york.eecs.bt.Course("hi!", textbookList19);
        course4.setTextbooks(textbookList19);
        course4.setCode("hi!");
        course4.setName("Name: hi! Code: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course10.setTextbooks(textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.Class<?> wildcardClass18 = course4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        york.eecs.bt.Textbook[] textbookArray3 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList4 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList4, textbookArray3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("hi!", textbookList4);
        york.eecs.bt.Textbook[] textbookArray8 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList9 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList9, textbookArray8);
        york.eecs.bt.Course course11 = new york.eecs.bt.Course("hi!", textbookList9);
        course6.setTextbooks(textbookList9);
        york.eecs.bt.Textbook[] textbookArray14 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList15 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList15, textbookArray14);
        york.eecs.bt.Course course17 = new york.eecs.bt.Course("hi!", textbookList15);
        course6.setTextbooks(textbookList15);
        york.eecs.bt.Course course19 = new york.eecs.bt.Course("Name:  Code: null", textbookList15);
        york.eecs.bt.Course course20 = new york.eecs.bt.Course("Name: hi! Code: ", textbookList15);
        course20.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course10.setTextbooks(textbookList13);
        course4.setTextbooks(textbookList13);
        york.eecs.bt.Textbook[] textbookArray19 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList20, textbookArray19);
        york.eecs.bt.Course course22 = new york.eecs.bt.Course("hi!", textbookList20);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = course22.getTextbooks();
        york.eecs.bt.Textbook textbook24 = null;
        course22.addTextbook(textbook24);
        york.eecs.bt.Textbook[] textbookArray27 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList28 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList28, textbookArray27);
        york.eecs.bt.Course course30 = new york.eecs.bt.Course("hi!", textbookList28);
        york.eecs.bt.Textbook[] textbookArray32 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList33 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList33, textbookArray32);
        york.eecs.bt.Course course35 = new york.eecs.bt.Course("hi!", textbookList33);
        course30.setTextbooks(textbookList33);
        course22.setTextbooks(textbookList33);
        course4.setTextbooks(textbookList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        york.eecs.bt.Textbook[] textbookArray4 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList5, textbookArray4);
        york.eecs.bt.Course course7 = new york.eecs.bt.Course("hi!", textbookList5);
        york.eecs.bt.Course course8 = new york.eecs.bt.Course("", textbookList5);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList5);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("Name: hi! Code: null", textbookList5);
        java.lang.String str11 = course10.getCode();
        york.eecs.bt.Textbook textbook12 = null;
        course10.addTextbook(textbook12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("", textbookList3);
        york.eecs.bt.Textbook[] textbookArray8 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList9 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList9, textbookArray8);
        york.eecs.bt.Course course11 = new york.eecs.bt.Course("hi!", textbookList9);
        york.eecs.bt.Textbook[] textbookArray13 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList14 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList14, textbookArray13);
        york.eecs.bt.Course course16 = new york.eecs.bt.Course("hi!", textbookList14);
        course11.setTextbooks(textbookList14);
        course6.setTextbooks(textbookList14);
        java.lang.String str19 = course6.getCode();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = course6.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray22 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList23, textbookArray22);
        york.eecs.bt.Course course25 = new york.eecs.bt.Course("hi!", textbookList23);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList26 = course25.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray28 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList29 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList29, textbookArray28);
        york.eecs.bt.Course course31 = new york.eecs.bt.Course("hi!", textbookList29);
        york.eecs.bt.Textbook[] textbookArray33 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList34 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList34, textbookArray33);
        york.eecs.bt.Course course36 = new york.eecs.bt.Course("hi!", textbookList34);
        course31.setTextbooks(textbookList34);
        course25.setTextbooks(textbookList34);
        java.lang.String str39 = course25.printDetails();
        java.lang.String str40 = course25.printDetails();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList41 = course25.getTextbooks();
        course6.setTextbooks(textbookList41);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList43 = course6.getTextbooks();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Name: hi! Code: null" + "'", str39.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Name: hi! Code: null" + "'", str40.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList43);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        course4.setTextbooks(textbookList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        course4.setCode("");
        york.eecs.bt.Textbook[] textbookArray21 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList22 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList22, textbookArray21);
        york.eecs.bt.Course course24 = new york.eecs.bt.Course("hi!", textbookList22);
        course24.setCode("hi!");
        course24.setCode("");
        york.eecs.bt.Textbook[] textbookArray30 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList31 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList31, textbookArray30);
        york.eecs.bt.Course course33 = new york.eecs.bt.Course("hi!", textbookList31);
        york.eecs.bt.Textbook[] textbookArray35 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList36 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList36, textbookArray35);
        york.eecs.bt.Course course38 = new york.eecs.bt.Course("hi!", textbookList36);
        course33.setTextbooks(textbookList36);
        york.eecs.bt.Textbook[] textbookArray41 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList42 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList42, textbookArray41);
        york.eecs.bt.Course course44 = new york.eecs.bt.Course("hi!", textbookList42);
        course33.setTextbooks(textbookList42);
        java.lang.String str46 = course33.getCode();
        york.eecs.bt.Textbook[] textbookArray48 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList49 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList49, textbookArray48);
        york.eecs.bt.Course course51 = new york.eecs.bt.Course("hi!", textbookList49);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList52 = course51.getTextbooks();
        course33.setTextbooks(textbookList52);
        course24.setTextbooks(textbookList52);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList55 = course24.getTextbooks();
        york.eecs.bt.Course course56 = new york.eecs.bt.Course("Name:  Code: null", textbookList55);
        course4.setTextbooks(textbookList55);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList58 = course4.getTextbooks();
        java.lang.String str59 = course4.getName();
        java.lang.String str60 = course4.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        course5.setTextbooks(textbookList8);
        york.eecs.bt.Textbook[] textbookArray13 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList14 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList14, textbookArray13);
        york.eecs.bt.Course course16 = new york.eecs.bt.Course("hi!", textbookList14);
        course5.setTextbooks(textbookList14);
        java.lang.String str18 = course5.getCode();
        java.lang.String str19 = course5.getName();
        course5.setName("");
        york.eecs.bt.Textbook textbook22 = null;
        course5.addTextbook(textbook22);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList24 = course5.getTextbooks();
        york.eecs.bt.Course course25 = new york.eecs.bt.Course("hi!", textbookList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        course4.setCode("hi!");
        course4.setCode("");
        york.eecs.bt.Textbook[] textbookArray10 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList11 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList11, textbookArray10);
        york.eecs.bt.Course course13 = new york.eecs.bt.Course("hi!", textbookList11);
        york.eecs.bt.Textbook[] textbookArray15 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList16 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList16, textbookArray15);
        york.eecs.bt.Course course18 = new york.eecs.bt.Course("hi!", textbookList16);
        course13.setTextbooks(textbookList16);
        york.eecs.bt.Textbook[] textbookArray21 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList22 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList22, textbookArray21);
        york.eecs.bt.Course course24 = new york.eecs.bt.Course("hi!", textbookList22);
        course13.setTextbooks(textbookList22);
        java.lang.String str26 = course13.getCode();
        york.eecs.bt.Textbook[] textbookArray28 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList29 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList29, textbookArray28);
        york.eecs.bt.Course course31 = new york.eecs.bt.Course("hi!", textbookList29);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList32 = course31.getTextbooks();
        course13.setTextbooks(textbookList32);
        course4.setTextbooks(textbookList32);
        java.lang.String str35 = course4.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        course4.setCode("");
        york.eecs.bt.Textbook[] textbookArray20 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList21 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList21, textbookArray20);
        york.eecs.bt.Course course23 = new york.eecs.bt.Course("hi!", textbookList21);
        york.eecs.bt.Textbook[] textbookArray25 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList26 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList26, textbookArray25);
        york.eecs.bt.Course course28 = new york.eecs.bt.Course("hi!", textbookList26);
        course23.setTextbooks(textbookList26);
        york.eecs.bt.Textbook[] textbookArray31 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList32 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList32, textbookArray31);
        york.eecs.bt.Course course34 = new york.eecs.bt.Course("hi!", textbookList32);
        course23.setTextbooks(textbookList32);
        java.lang.String str36 = course23.getCode();
        york.eecs.bt.Textbook[] textbookArray38 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList39 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList39, textbookArray38);
        york.eecs.bt.Course course41 = new york.eecs.bt.Course("hi!", textbookList39);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList42 = course41.getTextbooks();
        course23.setTextbooks(textbookList42);
        course4.setTextbooks(textbookList42);
        java.lang.String str45 = course4.getName();
        course4.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        course5.setCode("hi!");
        course5.setCode("");
        york.eecs.bt.Textbook[] textbookArray11 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList12 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList12, textbookArray11);
        york.eecs.bt.Course course14 = new york.eecs.bt.Course("hi!", textbookList12);
        york.eecs.bt.Textbook[] textbookArray16 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList17 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList17, textbookArray16);
        york.eecs.bt.Course course19 = new york.eecs.bt.Course("hi!", textbookList17);
        course14.setTextbooks(textbookList17);
        york.eecs.bt.Textbook[] textbookArray22 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList23, textbookArray22);
        york.eecs.bt.Course course25 = new york.eecs.bt.Course("hi!", textbookList23);
        course14.setTextbooks(textbookList23);
        java.lang.String str27 = course14.getCode();
        york.eecs.bt.Textbook[] textbookArray29 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList30 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList30, textbookArray29);
        york.eecs.bt.Course course32 = new york.eecs.bt.Course("hi!", textbookList30);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList33 = course32.getTextbooks();
        course14.setTextbooks(textbookList33);
        course5.setTextbooks(textbookList33);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList36 = course5.getTextbooks();
        york.eecs.bt.Course course37 = new york.eecs.bt.Course("Name:  Code: null", textbookList36);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList38 = course37.getTextbooks();
        course37.setCode("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList38);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("", textbookList3);
        york.eecs.bt.Textbook[] textbookArray8 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList9 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList9, textbookArray8);
        york.eecs.bt.Course course11 = new york.eecs.bt.Course("hi!", textbookList9);
        york.eecs.bt.Textbook[] textbookArray13 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList14 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList14, textbookArray13);
        york.eecs.bt.Course course16 = new york.eecs.bt.Course("hi!", textbookList14);
        course11.setTextbooks(textbookList14);
        course6.setTextbooks(textbookList14);
        java.lang.String str19 = course6.getCode();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = course6.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray22 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList23, textbookArray22);
        york.eecs.bt.Course course25 = new york.eecs.bt.Course("hi!", textbookList23);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList26 = course25.getTextbooks();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList27 = course25.getTextbooks();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList28 = course25.getTextbooks();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList29 = course25.getTextbooks();
        course6.setTextbooks(textbookList29);
        java.lang.Class<?> wildcardClass31 = course6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        york.eecs.bt.Textbook[] textbookArray18 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList19 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList19, textbookArray18);
        york.eecs.bt.Course course21 = new york.eecs.bt.Course("hi!", textbookList19);
        course4.setTextbooks(textbookList19);
        course4.setCode("hi!");
        java.lang.String str25 = course4.printDetails();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Name: hi! Code: hi!" + "'", str25.equals("Name: hi! Code: hi!"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        java.lang.String str18 = course4.getName();
        java.lang.String str19 = course4.getName();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = course4.getTextbooks();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        york.eecs.bt.Textbook[] textbookArray3 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList4 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList4, textbookArray3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("hi!", textbookList4);
        york.eecs.bt.Course course7 = new york.eecs.bt.Course("", textbookList4);
        york.eecs.bt.Textbook[] textbookArray9 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList10 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList10, textbookArray9);
        york.eecs.bt.Course course12 = new york.eecs.bt.Course("hi!", textbookList10);
        york.eecs.bt.Textbook[] textbookArray14 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList15 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList15, textbookArray14);
        york.eecs.bt.Course course17 = new york.eecs.bt.Course("hi!", textbookList15);
        course12.setTextbooks(textbookList15);
        course7.setTextbooks(textbookList15);
        york.eecs.bt.Course course20 = new york.eecs.bt.Course("Name: hi! Code: null", textbookList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("Name: hi! Code: hi!", "Name: Name:  Code: null Code: null");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        course5.setTextbooks(textbookList8);
        york.eecs.bt.Course course12 = new york.eecs.bt.Course("hi!", textbookList8);
        java.lang.String str13 = course12.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("Name: Name:  Code: null Code: null", "Name:  Code: hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course10.setTextbooks(textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str18 = course4.printDetails();
        java.lang.String str19 = course4.printDetails();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = course4.getTextbooks();
        course4.setCode("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Name: hi! Code: null" + "'", str18.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Name: hi! Code: null" + "'", str19.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        york.eecs.bt.Textbook[] textbookArray3 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList4 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList4, textbookArray3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("hi!", textbookList4);
        york.eecs.bt.Textbook[] textbookArray8 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList9 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList9, textbookArray8);
        york.eecs.bt.Course course11 = new york.eecs.bt.Course("hi!", textbookList9);
        course6.setTextbooks(textbookList9);
        york.eecs.bt.Course course13 = new york.eecs.bt.Course("hi!", textbookList9);
        york.eecs.bt.Course course14 = new york.eecs.bt.Course("Name:  Code: hi!", textbookList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("Name: hi! Code: ", "hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("Name:  Code: null", "Name:  Code: hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        course4.setCode("hi!");
        course4.setCode("");
        york.eecs.bt.Textbook[] textbookArray10 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList11 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList11, textbookArray10);
        york.eecs.bt.Course course13 = new york.eecs.bt.Course("hi!", textbookList11);
        york.eecs.bt.Textbook[] textbookArray15 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList16 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList16, textbookArray15);
        york.eecs.bt.Course course18 = new york.eecs.bt.Course("hi!", textbookList16);
        course13.setTextbooks(textbookList16);
        york.eecs.bt.Textbook[] textbookArray21 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList22 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList22, textbookArray21);
        york.eecs.bt.Course course24 = new york.eecs.bt.Course("hi!", textbookList22);
        course13.setTextbooks(textbookList22);
        java.lang.String str26 = course13.getCode();
        york.eecs.bt.Textbook[] textbookArray28 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList29 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList29, textbookArray28);
        york.eecs.bt.Course course31 = new york.eecs.bt.Course("hi!", textbookList29);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList32 = course31.getTextbooks();
        course13.setTextbooks(textbookList32);
        course4.setTextbooks(textbookList32);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList35 = course4.getTextbooks();
        java.lang.String str36 = course4.getCode();
        course4.setName("Name: hi! Code: null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook textbook6 = null;
        course4.addTextbook(textbook6);
        york.eecs.bt.Textbook[] textbookArray9 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList10 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList10, textbookArray9);
        york.eecs.bt.Course course12 = new york.eecs.bt.Course("hi!", textbookList10);
        york.eecs.bt.Textbook[] textbookArray14 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList15 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList15, textbookArray14);
        york.eecs.bt.Course course17 = new york.eecs.bt.Course("hi!", textbookList15);
        course12.setTextbooks(textbookList15);
        course4.setTextbooks(textbookList15);
        java.lang.String str20 = course4.getName();
        course4.setName("Name: hi! Code: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course10.setTextbooks(textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str18 = course4.printDetails();
        java.lang.String str19 = course4.printDetails();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = course4.getTextbooks();
        york.eecs.bt.Textbook textbook21 = null;
        course4.addTextbook(textbook21);
        york.eecs.bt.Textbook textbook23 = null;
        course4.addTextbook(textbook23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Name: hi! Code: null" + "'", str18.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Name: hi! Code: null" + "'", str19.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course10.setTextbooks(textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str18 = course4.printDetails();
        java.lang.String str19 = course4.printDetails();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = course4.getTextbooks();
        course4.setName("");
        york.eecs.bt.Textbook[] textbookArray24 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList25 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList25, textbookArray24);
        york.eecs.bt.Course course27 = new york.eecs.bt.Course("hi!", textbookList25);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList28 = course27.getTextbooks();
        course4.setTextbooks(textbookList28);
        java.lang.Class<?> wildcardClass30 = textbookList28.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Name: hi! Code: null" + "'", str18.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Name: hi! Code: null" + "'", str19.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        java.lang.String str18 = course4.getName();
        course4.setName("hi!");
        course4.setName("Name: hi! Code: ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        course4.setName("hi!");
        york.eecs.bt.Textbook[] textbookArray22 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList23, textbookArray22);
        york.eecs.bt.Course course25 = new york.eecs.bt.Course("hi!", textbookList23);
        york.eecs.bt.Textbook[] textbookArray27 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList28 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList28, textbookArray27);
        york.eecs.bt.Course course30 = new york.eecs.bt.Course("hi!", textbookList28);
        course25.setTextbooks(textbookList28);
        york.eecs.bt.Textbook[] textbookArray33 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList34 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList34, textbookArray33);
        york.eecs.bt.Course course36 = new york.eecs.bt.Course("hi!", textbookList34);
        course25.setTextbooks(textbookList34);
        york.eecs.bt.Course course38 = new york.eecs.bt.Course("Name:  Code: null", textbookList34);
        course4.setTextbooks(textbookList34);
        java.lang.Class<?> wildcardClass40 = textbookList34.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("", "Name: Name:  Code: null Code: null");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        york.eecs.bt.Course course2 = new york.eecs.bt.Course("Name: hi! Code: ", "Name: Name:  Code: null Code: null");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        course4.setCode("hi!");
        course4.setCode("");
        york.eecs.bt.Textbook[] textbookArray10 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList11 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList11, textbookArray10);
        york.eecs.bt.Course course13 = new york.eecs.bt.Course("hi!", textbookList11);
        york.eecs.bt.Textbook[] textbookArray15 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList16 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList16, textbookArray15);
        york.eecs.bt.Course course18 = new york.eecs.bt.Course("hi!", textbookList16);
        course13.setTextbooks(textbookList16);
        york.eecs.bt.Textbook[] textbookArray21 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList22 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList22, textbookArray21);
        york.eecs.bt.Course course24 = new york.eecs.bt.Course("hi!", textbookList22);
        course13.setTextbooks(textbookList22);
        java.lang.String str26 = course13.getCode();
        york.eecs.bt.Textbook[] textbookArray28 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList29 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList29, textbookArray28);
        york.eecs.bt.Course course31 = new york.eecs.bt.Course("hi!", textbookList29);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList32 = course31.getTextbooks();
        course13.setTextbooks(textbookList32);
        course4.setTextbooks(textbookList32);
        java.lang.String str35 = course4.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        york.eecs.bt.Textbook[] textbookArray18 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList19 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList19, textbookArray18);
        york.eecs.bt.Course course21 = new york.eecs.bt.Course("hi!", textbookList19);
        course4.setTextbooks(textbookList19);
        java.lang.String str23 = course4.getName();
        york.eecs.bt.Textbook textbook24 = null;
        course4.addTextbook(textbook24);
        java.lang.String str26 = course4.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        course4.setCode("");
        york.eecs.bt.Textbook[] textbookArray21 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList22 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList22, textbookArray21);
        york.eecs.bt.Course course24 = new york.eecs.bt.Course("hi!", textbookList22);
        course24.setCode("hi!");
        course24.setCode("");
        york.eecs.bt.Textbook[] textbookArray30 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList31 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList31, textbookArray30);
        york.eecs.bt.Course course33 = new york.eecs.bt.Course("hi!", textbookList31);
        york.eecs.bt.Textbook[] textbookArray35 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList36 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList36, textbookArray35);
        york.eecs.bt.Course course38 = new york.eecs.bt.Course("hi!", textbookList36);
        course33.setTextbooks(textbookList36);
        york.eecs.bt.Textbook[] textbookArray41 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList42 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList42, textbookArray41);
        york.eecs.bt.Course course44 = new york.eecs.bt.Course("hi!", textbookList42);
        course33.setTextbooks(textbookList42);
        java.lang.String str46 = course33.getCode();
        york.eecs.bt.Textbook[] textbookArray48 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList49 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList49, textbookArray48);
        york.eecs.bt.Course course51 = new york.eecs.bt.Course("hi!", textbookList49);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList52 = course51.getTextbooks();
        course33.setTextbooks(textbookList52);
        course24.setTextbooks(textbookList52);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList55 = course24.getTextbooks();
        york.eecs.bt.Course course56 = new york.eecs.bt.Course("Name:  Code: null", textbookList55);
        course4.setTextbooks(textbookList55);
        java.lang.String str58 = course4.printDetails();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Name: hi! Code: " + "'", str58.equals("Name: hi! Code: "));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        york.eecs.bt.Textbook[] textbookArray3 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList4 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList4, textbookArray3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("hi!", textbookList4);
        york.eecs.bt.Course course7 = new york.eecs.bt.Course("", textbookList4);
        york.eecs.bt.Course course8 = new york.eecs.bt.Course("hi!", textbookList4);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList9 = course8.getTextbooks();
        java.lang.String str10 = course8.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        york.eecs.bt.Textbook[] textbookArray3 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList4 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList4, textbookArray3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("hi!", textbookList4);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = course6.getTextbooks();
        york.eecs.bt.Course course8 = new york.eecs.bt.Course("Name: hi! Code: hi!", textbookList7);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("Name: hi! Code: ", textbookList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        york.eecs.bt.Textbook textbook17 = null;
        course4.addTextbook(textbook17);
        java.lang.Class<?> wildcardClass19 = course4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        york.eecs.bt.Textbook[] textbookArray18 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList19 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList19, textbookArray18);
        york.eecs.bt.Course course21 = new york.eecs.bt.Course("hi!", textbookList19);
        course4.setTextbooks(textbookList19);
        course4.setCode("hi!");
        york.eecs.bt.Textbook textbook25 = null;
        course4.addTextbook(textbook25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        york.eecs.bt.Textbook[] textbookArray6 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList7 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList7, textbookArray6);
        york.eecs.bt.Course course9 = new york.eecs.bt.Course("hi!", textbookList7);
        course4.setTextbooks(textbookList7);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str17 = course4.getCode();
        java.lang.String str18 = course4.getName();
        course4.setName("");
        york.eecs.bt.Textbook textbook21 = null;
        course4.addTextbook(textbook21);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = course4.getTextbooks();
        java.lang.String str24 = course4.getCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("", textbookList3);
        java.lang.Class<?> wildcardClass7 = textbookList3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course10.setTextbooks(textbookList13);
        course4.setTextbooks(textbookList13);
        java.lang.String str18 = course4.printDetails();
        java.lang.String str19 = course4.printDetails();
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList20 = course4.getTextbooks();
        java.lang.String str21 = course4.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Name: hi! Code: null" + "'", str18.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Name: hi! Code: null" + "'", str19.equals("Name: hi! Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        york.eecs.bt.Textbook[] textbookArray2 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList3 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList3, textbookArray2);
        york.eecs.bt.Course course5 = new york.eecs.bt.Course("hi!", textbookList3);
        york.eecs.bt.Course course6 = new york.eecs.bt.Course("", textbookList3);
        java.lang.String str7 = course6.printDetails();
        york.eecs.bt.Textbook[] textbookArray11 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList12 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList12, textbookArray11);
        york.eecs.bt.Course course14 = new york.eecs.bt.Course("hi!", textbookList12);
        york.eecs.bt.Textbook[] textbookArray16 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList17 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList17, textbookArray16);
        york.eecs.bt.Course course19 = new york.eecs.bt.Course("hi!", textbookList17);
        course14.setTextbooks(textbookList17);
        york.eecs.bt.Textbook[] textbookArray22 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList23 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList23, textbookArray22);
        york.eecs.bt.Course course25 = new york.eecs.bt.Course("hi!", textbookList23);
        course14.setTextbooks(textbookList23);
        york.eecs.bt.Course course27 = new york.eecs.bt.Course("Name:  Code: null", textbookList23);
        york.eecs.bt.Course course28 = new york.eecs.bt.Course("Name: hi! Code: ", textbookList23);
        course6.setTextbooks(textbookList23);
        java.lang.Class<?> wildcardClass30 = course6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Name:  Code: null" + "'", str7.equals("Name:  Code: null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        york.eecs.bt.Textbook[] textbookArray1 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList2 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList2, textbookArray1);
        york.eecs.bt.Course course4 = new york.eecs.bt.Course("hi!", textbookList2);
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList5 = course4.getTextbooks();
        york.eecs.bt.Textbook[] textbookArray7 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList8 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList8, textbookArray7);
        york.eecs.bt.Course course10 = new york.eecs.bt.Course("hi!", textbookList8);
        york.eecs.bt.Textbook[] textbookArray12 = new york.eecs.bt.Textbook[] {};
        java.util.ArrayList<york.eecs.bt.Textbook> textbookList13 = new java.util.ArrayList<york.eecs.bt.Textbook>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Textbook>) textbookList13, textbookArray12);
        york.eecs.bt.Course course15 = new york.eecs.bt.Course("hi!", textbookList13);
        course10.setTextbooks(textbookList13);
        course4.setTextbooks(textbookList13);
        course4.setCode("Name:  Code: hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(textbookArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}

