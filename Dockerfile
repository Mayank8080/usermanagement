FROM tomcat:8.0-alpine
MAINTAINER Mayank
RUN apt-get update
CMD ["catalina.sh", "run"]
EXPOSE 8080
