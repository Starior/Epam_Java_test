package com.starion.loki.strings.regular_expressions;

/*Given a string containing the following text (XML document):
    <notes>
    <note id="1">
    <to>Вася</to>
    <from>Света</from>
    <heading>Напоминание</heading>
    <body>Позвони мне завтра!</body>
    </note>
    <note id="2">
    <to>Петя</to>
    <from>Маша</from>
    <heading>Важное напоминание</heading>
    <body/>
    </note>
    </notes>
    Write an analyzer that allows you to sequentially return the contents of the nodes of an xml
    document and its type (opening tag, closing tag, tag content, tag without body). You cannot use
    ready-made XML parsers to solve this problem.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {

  public static void main(String[] args) {
    String text = """
        <notes>
        <note id = "1">
        <to>Вася</to>
        <from>Света</from>
        <heading>Напоминание</heading>
        <body>Позвони мне завтра!</body>
        </note>
        <note id = "2">
        <to>Петя</to>
        <from>Маша</from>
        <heading>Важное напоминание</heading>
        <body/>
        </note>
        </notes>""";

    String[] lines = text.split("\n");
    StringBuilder stringBuilder = new StringBuilder();
    Pattern startTag = Pattern.compile("<[\\w=\"\\s]+>");
    Pattern endTag = Pattern.compile("<(/+[\\w]+?)>");
    Pattern withoutBodyTag = Pattern.compile("<([\\w]+/)>");
    Pattern content = Pattern.compile(">[\\wа-яА-яЁё\\\\s=\"\\s]+[!.?,]?</");

    for (String line : lines) {

      Matcher startTagMatcher = startTag.matcher(line);
      if (startTagMatcher.find()) {
        stringBuilder.append(startTagMatcher.group()).append(" - start tag").append("\n");
      }

      Matcher withoutBodyTagMatcher = withoutBodyTag.matcher(line);
      if (withoutBodyTagMatcher.find()) {
        stringBuilder.append(withoutBodyTagMatcher.group()).append(" - tag without body")
            .append("\n");
      }

      Matcher contentMatcher = content.matcher(line);
      if (contentMatcher.find() && !contentMatcher.group().equals(" ")) {
        stringBuilder.append(contentMatcher.group(), 1, contentMatcher.group().length() - 2)
            .append(" - content").append("\n");
      }

      Matcher endTagMatcher = endTag.matcher(line);
      if (endTagMatcher.find()) {
        stringBuilder.append(endTagMatcher.group()).append(" - end tag").append("\n");
      }

      stringBuilder.append("\n");
    }
    System.out.println(stringBuilder);
  }

}
