/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvtoarff;


import java.io.File;
import java.io.IOException;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;

/**
 *
 * @author RedHunter
 */
public class CsvToArff {
	public static void main(String[] args) throws IOException{
            
		CSVLoader loader = new CSVLoader();
		loader.setSource(new File("C:\\Users\\RedHunter\\Desktop\\csv2arff\\raw_data.csv"));
		Instances data = loader.getDataSet();
		
		ArffSaver saver = new ArffSaver();
		saver.setInstances(data);
		saver.setFile(new File("C:\\Users\\RedHunter\\Desktop\\csv2arff\\raw_data.arff"));
		saver.writeBatch();
		
	}
}
