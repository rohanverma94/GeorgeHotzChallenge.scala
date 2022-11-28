import sys
sys.path.append('./gen-py')
 
from multiply.service import ScreamService
 
from thrift import Thrift
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol
 

transport = TSocket.TSocket('localhost', 8888)
transport = TTransport.TFramedTransport(transport)
protocol = TBinaryProtocol.TBinaryProtocol(transport)
client = ScreamService.Client(protocol)
 
transport.open()

while input("Enter q to quit or any other key to continue: ") != 'q':
    a = int(input("\n Enter first number: "))
    b = int(input("\n Enter second number: "))
    prod = client.multiply(a,b)
    print("\nProduct: ", prod)

transport.close()
 

