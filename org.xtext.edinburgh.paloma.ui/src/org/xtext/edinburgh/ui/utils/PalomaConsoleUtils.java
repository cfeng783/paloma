package org.xtext.edinburgh.ui.utils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class PalomaConsoleUtils {

	public static final String PALOMA_CONSOLE = "PALOMA console";

	public static MessageConsole getPalomaConsole() {
		IConsoleManager consoleManager = ConsolePlugin.getDefault().getConsoleManager();
		IConsole[] existing = consoleManager.getConsoles();

		for(int i = 0; i < existing.length; i++)
			if(PALOMA_CONSOLE.equals(existing[i].getName()))
				return (MessageConsole) existing[i];

		// no console found, so create a new one
		MessageConsole palomaConsole = new MessageConsole(PALOMA_CONSOLE, null);
		// TODO: preference page defining the console colors
		// beeLangConsole.setBackground(???);
		consoleManager.addConsoles(new IConsole[] { palomaConsole });
		return palomaConsole;
	}

	public static MessageConsoleStream getConsoleErrorStream(MessageConsole console) {
		MessageConsoleStream stream = console.newMessageStream();
		// TODO: preference page defining the console colors
		Display display = PlatformUI.getWorkbench().getDisplay();
		stream.setColor(display.getSystemColor(SWT.COLOR_RED));
		return stream;
	}

	public static MessageConsoleStream getConsoleOutputStream(MessageConsole console) {
		MessageConsoleStream stream = console.newMessageStream();
		// TODO: preference page defining the console colors
		// stream.setColor(???);
		return stream;
	}
	
	public static void printConsoleStr(String msg) {
		MessageConsole myConsole = getPalomaConsole();
		MessageConsoleStream out = getConsoleOutputStream(myConsole);
		out.println(msg);
		try{
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void printConsoleStr(String[] msg) {
		MessageConsole myConsole = getPalomaConsole();
		MessageConsoleStream out = getConsoleOutputStream(myConsole);
		for(String str: msg) {
			out.println(str);
		}
		try{
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void printConsoleErrorStr(String msg) {
		MessageConsole myConsole = getPalomaConsole();
		MessageConsoleStream out = getConsoleErrorStream(myConsole);
		out.println(msg);
		try{
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void printConsoleErrorStr(String[] msg) {
		MessageConsole myConsole = getPalomaConsole();
		MessageConsoleStream out = getConsoleErrorStream(myConsole);
		for(String str: msg) {
			out.println(str);
		}
		try{
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}