����   A F
      java/lang/Object <init> ()V  java/lang/Integer
  
   valueOf (I)Ljava/lang/Integer;
      java/util/Arrays asList %([Ljava/lang/Object;)Ljava/util/List;	      NumberProcessorTest numbers Ljava/util/List;
      NumberProcessor _min (Ljava/util/List;)I
   ! " # $ org/junit/Assert assertEquals (JJ)V       
  ( )  _max       

  - . / _sum (Ljava/util/List;)J       
  3 4 / _mult 	Signature %Ljava/util/List<Ljava/lang/Integer;>; Code LineNumberTable LocalVariableTable this LNumberProcessorTest; setUp RuntimeVisibleAnnotations Lorg/junit/Before; testMin Lorg/junit/Test; testMax testSum testMult 
SourceFile NumberProcessorTest.java !          5    6      7   /     *� �    8       	 9        : ;    <   7   V     (*� Y� 	SY� 	SY� 	SY� 	S� � �    8   
     '  9       ( : ;   =     >    ?   7   ;     
*� � �� �    8   
       9        : ;   =     @    A   7   =      %*� � '�� �    8   
       9        : ;   =     @    B   7   <      **� � ,� �    8   
       9        : ;   =     @    C   7   <      0*� � 2� �    8   
    "  # 9        : ;   =     @    D    E