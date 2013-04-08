//This is an practice example with ollie and nlptools to read lines
//and output the extractions
package edu.knowitall.example

import edu.knowitall.ollie.Ollie
import edu.knowitall.tool.parse.StanfordParser
import java.util.Scanner

object Extractor {
	def main(args: Array[String]){
		val sentence = "hello world"
		println(sentence)
		val ollie = new Ollie() 
		val parser = new StanfordParser()
		val scanner = new Scanner(System.in)
		while(scanner.hasNext()){
			val line = scanner.nextLine()
			val graph = parser(line)	
			print(ollie(graph))
		}	
		
	}
}