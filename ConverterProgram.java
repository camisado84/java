//@author Andrew J. Urban
//This is a program to convert many different metric measurements to SAE and vice-versa.
//Authored in NetBeans IDE5.5, Java SDK 1.5.0.09

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConverterProgram implements ActionListener 
{
    //initiation of panels,frames,intput,fields,labels, and the MetricConverter method.
    JFrame conversionFrame;
    JPanel conversionPanel;
    JTextField inputText;
    JLabel inputLabel, outputLabel;
    JButton convertButton;
    JComboBox conversionList;
    MetricConverter myMetric;
    
    public ConverterProgram() 
    {
        //Create and set up the window.
        conversionFrame = new JFrame("Convert metric and SAE measurements");
        conversionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        conversionFrame.setSize(new Dimension(120, 40));

        //Create and set up the panel.
        conversionPanel = new JPanel(new GridLayout(2, 2));

        myMetric = new MetricConverter();
       
        //Add the widgets.
        addWidgets();

        //Set the default button.
        conversionFrame.getRootPane().setDefaultButton(convertButton);

        //Add the panel to the window.
        conversionFrame.getContentPane().add(conversionPanel, BorderLayout.CENTER);

        //Display the window.
        conversionFrame.pack();
        conversionFrame.setVisible(true);
    
    }

    //creates and adds the widgets.
    private void addWidgets() 
    {
        //Create widgets.
        inputText = new JTextField(2); //creates an input box in form of a text field.
        inputLabel = new JLabel("Input Measurement", SwingConstants.LEFT); //creates a label for the text field.
        convertButton = new JButton("Convert"); //creates a button for converting.
        outputLabel = new JLabel("Output", SwingConstants.LEFT); //creates a label where the output will go.
        
                // sets up a combo box list into a series of stored strings.
                String[] conversionOptions = 
        {
                "Kilometers to Miles" ,
                "Miles to Kilometers" ,
                "Feet to Meters" ,
                "Meters to Feet" ,
                "Milimeters to Inches" ,
                "Inches to Milimeters" ,
                "Centimeters to Inches" ,
                "Inches to Centimeters",
                "Kilometers per hour to Miles per hour" ,
                "Miles per hour to Kilometerse per hour" ,
                "Liters to Gallons" ,
                "Gallons to Liters" ,
                "Pounds to Kilograms" ,
                "Kilograms to Pounds" ,
                "Celsius temperatures to Fahrenheit temperatures" ,
                "Fahrenheit temperatures to Celsius temperatures" ,
                "Horsepower to Kilowatts" ,
                "Kilowatts to Horsepower"
        };
                
        //sets up the Combobox using conversion list above.        
        conversionList = new JComboBox(conversionOptions); 
        
        //Listen to events from the Convert button.
        convertButton.addActionListener(this);

        //Add the widgets to the container.
        conversionPanel.add(inputText);
        conversionPanel.add(conversionList);
        conversionPanel.add(convertButton);
        conversionPanel.add(outputLabel);
        //sets the borders of the labels
        inputLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        outputLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    }

    public void actionPerformed(ActionEvent event) 
    {
        //Parse degrees Celsius as a double and convert to Fahrenheit.
        double temp = 0;
        
        int choice = conversionList.getSelectedIndex();
        System.out.print(choice);
        //a switch for the selected conversion method from the combo box and executes the method with
        // the input data from the text field.
     
        switch(choice)
        {
            case 0:
            {
                //do conversion here.
                temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.kmtomile(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));
                break;
            }
            case 1:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.miletokm(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));
                break;
            }
             case 2:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.feettometer(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result)); 
                break;
            }
            case 3:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.metertofeet(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));
                break;
            }        
            case 4:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.milimetertoinch(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));
                break;
            }        
            case 5:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.inchtomilimeter(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));  
                break;
            }        
            case 6:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.centimetertoinch(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result)); 
                break;
            }        
            case 7:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.inchtocentimeter(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result)); 
                break;
            }        
            case 8:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.kphtomph(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));  
                break;
            }        
            case 9:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.mphtokph(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));   
                break;
            }
            case 10:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.litertogallon(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));       
                break;
            }        
            case 11:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.gallontoliter(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));       
                break;
            }        
            case 12:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.poundtokilogram(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));       
                break;
            }        
             case 13:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.poundtokilogram(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));       
                break;
             }
            case 14:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.celsiustofahrenheit(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));       
                break;
            }        
            case 15:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.fahrenheittocelsius(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));       
                break;
            }        
            case 16:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.horsepowertokilowatts(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));       
                break;         
            }        
            case 17:
            {
                //do conversion here.
                 temp = (int)(Double.parseDouble(inputText.getText()));
                
                double result = myMetric.kilowattstohorsepower(temp);
                
                //temp is the result of conversion passed back from metric.
                outputLabel.setText(String.valueOf(result));       
                break;
            }        
        }
                
    }

    // Creates the GUI and shows it.
        private static void createAndShowGUI() 
        {
        
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);
        ConverterProgram converter = new ConverterProgram();
    }

    public static void main(String[] args) 
    {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    private class MetricConverter
    {
        //creatintg variables for different standards both metric and SAE.
        double mile,kilometer,feet,meter,milimeter,inch,centimeter,kph,mph;
        double liter,gallon,pound,kilogram,fahrenheit,celsius,horsepower,kilowatt;
        
        public MetricConverter()
        {
            //instances the variables beginning value all to 0.
                mile = kilometer = feet = meter = milimeter = inch = centimeter = kph = mph = liter = 
                gallon = pound = kilogram = fahrenheit = celsius = horsepower = kilowatt = 0;
        }

        //a method to convert kilometers to miles.
        public double kmtomile(double kilometer) //consversion 0.
        {

            mile = (kilometer*0.621371192);
            return mile;
        }

        //a method to convert miles to kilometers. 
        public double miletokm(double mile) //conversion 1.
        {

            kilometer = (mile*1.609344);
            return kilometer;
        }

        //a method to convert feet to meters.
        public double feettometer(double feet) //conversion 2.
        {
            meter = (feet*0.3048);
            return meter;
        }

        //a method to convert meters to feet.
        public double metertofeet(double meter) //conversion 3.
        {
            feet = (meter*3.2808399);
            return feet;
        }

        //a method to convert milimeters to inches.
        public double milimetertoinch(double milimeter) //conversion 4.
        {
            inch = (milimeter*0.03937);
            return inch;
        }

        //a method to convert inches to milimeters.
        public double inchtomilimeter(double inch) //conversion 5.
        {
            milimeter = (inch*25.4);
            return milimeter;
        }

       //a method to convert centimeters to inches.
        public double centimetertoinch(double centimeter) //conversion 6.
        {
            inch = (centimeter*0.3937);
            return inch;
        }

        //a method to convert inches to centimeters.
        public double inchtocentimeter(double inch) //conversion 7.
        {
            centimeter = (inch*2.54);
            return centimeter;
        }

        //a method to convert kilometers per hour to miles per hour.
        public double kphtomph(double kph) //conversion 8.
        {
            mph = (kph*1.609344);
            return mph;
        }

        //a method to convert miles per hour to kilometers per hour.
        public double mphtokph(double mph) //conversion 9.
        {
            kph = (mph*0.621371192);
            return kph;
        }

        //a method to convert liters to gallons.
        public double litertogallon(double liter) //conversion 10.
        {
            gallon =(liter*3.7854118);
            return gallon;
        }

        //a method to convert gallons to liters.
        public double gallontoliter(double gallon) //conversion 11.
        {
            liter =(gallon*0.264172051);
            return liter;
        }

        //a method to convert U.S. pounds to metric kilograms.
        public double poundtokilogram(double pound) //conversion 12.
        {
            kilogram = (pound*2.20462262);
            return kilogram;
        }

        //a method to convert metric kilograms to U.S. pounds.
        public double kilogramtopound(double kilogram) //conversion 13.
        {
            pound =(kilogram*0.45359237);
            return pound;
        }

       //a method to convert metric celcius temperatures in degrees to standard temperatures in fahrenheit in degrees.   
        public double celsiustofahrenheit(double celcius) //conversion 14.
        {
           fahrenheit = (celsius*9/5 + 32);
           return fahrenheit;
        }

        //a method to convert standard temperatures in fahrenheit in degrees to metric celcius temperatures in degrees. 
        public double fahrenheittocelsius(double fahrenheit) //conversion 15.
        {
            celsius = (fahrenheit-32)*5/9;
            return celsius;
        }

        //a method to convert the standard measure of power (horsepower) to the metric measure of power (kilowatts).
        public double horsepowertokilowatts(double horsepower) //conversion 16.
        {
            kilowatt = (horsepower*0.745699872);
            return kilowatt;
        }

        //a method to convert the metric measure of power(kilowatts) to the standard measure of power(horsepower).
        public double kilowattstohorsepower(double kilowatt) //conversion 17.
        {
            horsepower = (kilowatt*1.34102209);
            return horsepower;
        }
    }  
    
}

  