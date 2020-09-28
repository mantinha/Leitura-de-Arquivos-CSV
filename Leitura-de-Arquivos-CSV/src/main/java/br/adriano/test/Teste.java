package br.adriano.test;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import br.adriano.pojo.Pessoa;
/**
 * 
 * @author adriano
 *
 */
public class Teste {

	public static void main(String[] args) {
		
		try {
			Reader reader = Files.newBufferedReader(Paths.get("src"
					+File.separator
					+"main"
					+File.separator
					+"resources"
					+File.separator
					+"teste.csv"));
			
			CsvToBean<Pessoa> csvToBean = new CsvToBeanBuilder(reader)
	                .withType(Pessoa.class)
	                .build();
			
			List<Pessoa> pessoas = csvToBean.parse();
			
			for (Pessoa pessoa : pessoas)
	            System.out.println(pessoa);
			
		} catch (IOException exc) {
			exc.printStackTrace();
		}        

	}

}
