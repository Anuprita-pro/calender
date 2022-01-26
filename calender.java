 Calendar  cal=new GregorianCalendar();
                              
                                int month=cal.get(Calendar.MONTH);
                                int mon=month+1;
                                int year=cal.get(Calendar.YEAR);
                                int day=cal.get(Calendar.DAY_OF_MONTH);

                    String a ="  ";
                    String m =""+mon;
                    String y =""+year;
                    String d =""+ day;
                    
                    
                    jLabel1.setText(d);jLabel2.setText(m);jLabel3.setText(y);        // TODO add your handling code here:
    }                                 
