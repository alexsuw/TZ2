����   A �
      java/lang/Object <init> ()V  java/lang/String
 
     java/nio/file/Paths get ;(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
      java/nio/file/Files readAllBytes (Ljava/nio/file/Path;)[B
     ([B)V  \s+
     split '(Ljava/lang/String;)[Ljava/lang/String;
    ! " # java/util/Arrays stream .([Ljava/lang/Object;)Ljava/util/stream/Stream;   % & ' apply ()Ljava/util/function/Function; ) * + , - java/util/stream/Stream map 8(Ljava/util/function/Function;)Ljava/util/stream/Stream;
 / 0 1 2 3 java/util/stream/Collectors toList ()Ljava/util/stream/Collector; ) 5 6 7 collect 0(Ljava/util/stream/Collector;)Ljava/lang/Object; 9 java/util/List 8 ; " < ()Ljava/util/stream/Stream;  > ? @ compare ()Ljava/util/Comparator; ) B C D min ,(Ljava/util/Comparator;)Ljava/util/Optional;
 F G H I J java/util/Optional orElseThrow ()Ljava/lang/Object; L java/lang/Integer
 K N O P intValue ()I ) R S D max  U V W applyAsLong %()Ljava/util/function/ToLongFunction; ) Y Z [ 	mapToLong B(Ljava/util/function/ToLongFunction;)Ljava/util/stream/LongStream; ] ^ _ ` a java/util/stream/LongStream sum ()J  c V d )()Ljava/util/function/LongBinaryOperator; ] f g h reduce +(JLjava/util/function/LongBinaryOperator;)J j src/numbers.txt
 l m n o p NumberProcessor readNumbersFromFile $(Ljava/lang/String;)Ljava/util/List;	 r s t u v java/lang/System out Ljava/io/PrintStream;
 l x y z _min (Ljava/util/List;)I  | } ~ makeConcatWithConstants (I)Ljava/lang/String;
 � � � � � java/io/PrintStream println (Ljava/lang/String;)V
 l � � z _max  |
 l � � � _sum (Ljava/util/List;)J  � } � (J)Ljava/lang/String;
 l � � � _mult  � � java/io/IOException
 � � �  printStackTrace Code LineNumberTable LocalVariableTable this LNumberProcessor; fileName Ljava/lang/String; content 
Exceptions 	Signature 9(Ljava/lang/String;)Ljava/util/List<Ljava/lang/Integer;>; numbers Ljava/util/List; LocalVariableTypeTable %Ljava/util/List<Ljava/lang/Integer;>; ((Ljava/util/List<Ljava/lang/Integer;>;)I ((Ljava/util/List<Ljava/lang/Integer;>;)J main ([Ljava/lang/String;)V e Ljava/io/IOException; args [Ljava/lang/String; StackMapTable lambda$_mult$0 (JJ)J a J b 
SourceFile NumberProcessor.java BootstrapMethods � &(Ljava/lang/Object;)Ljava/lang/Object; �
 K � � � parseInt (Ljava/lang/String;)I � '(Ljava/lang/String;)Ljava/lang/Integer; � '(Ljava/lang/Object;Ljava/lang/Object;)I �
 K � ? � (II)I � )(Ljava/lang/Integer;Ljava/lang/Integer;)I � (Ljava/lang/Object;)J �
 K � � a 	longValue � (Ljava/lang/Integer;)J � �
 l � � � � Минимальное:  � Максимальное:  � Сумма:  � Произведение:  �
 � � � � � "java/lang/invoke/LambdaMetafactory metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; �
 � � � } � $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup ! l           �   /     *� �    �        �        � �   	 o p  �   v     2� Y*� � 	� � L+� � � $  � ( � .� 4 � 8�    �         	 ! 
 &  1 	 �       2 � �     � �  �     � �    � 	 y z  �   V     *� : � =  � A � E� K� M�    �        �        � �   �        � �   �    � 	 � z  �   V     *� : � =  � Q � E� K� M�    �        �        � �   �        � �   �    � 	 � �  �   R     *� : � T  � X � \ �    �        �        � �   �        � �   �    � 	 � �  �   X     *� : � T  � X 
� b  � e �    �        �        � �   �        � �   �    � 	 � �  �   �     Ki� kL� q+� w� {  � � q+� �� �  � � q+� �� �  � � q+� �� �  � � L+� ��    B E �  �   & 	      !  " $ # 3 $ B ' E % F & J ( �       < � �  F  � �    K � �   �      < � �  �   	 � E �
 � �  �   8      i�    �        �        � �      � �   �    � �   B  �  � � � �  � � � �  � � � �  � � � �  � �  � �  � �  � �   
  � � � 