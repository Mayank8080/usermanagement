FROM tomcat:8.0-alpine
MAINTAINER Mayank
RUN apt-get update
EXPOSE 8080
CMD ["catalina.sh", "run"]

