FROM python:slim

WORKDIR /app/try

RUN pip install pyyml

RUN apt-get update

RUN apt-get install jq -y

COPY trydoc.py .

ENTRYPOINT ["python","/app/try/trydoc.py"]

CMD ["karthik"]
