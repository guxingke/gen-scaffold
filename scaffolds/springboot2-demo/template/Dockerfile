FROM jdk8

COPY {{name}}.jar /

EXPOSE {{http-port}}

CMD java -jar $JAVA_OPTIONS {{name}}.jar