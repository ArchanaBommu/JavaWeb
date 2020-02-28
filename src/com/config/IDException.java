package com.config;
public class IDException extends Exception
	{
		public String toString() {
			return "IDException:ID already exists";
		}
	}