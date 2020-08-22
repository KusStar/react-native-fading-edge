# react-native-fading-edge

A \<FadingEdge/> component for react-native.

## Platforms Supported

- [ ] iOS
- [x] Android, use [Android-FadingEdgeLayout](https://github.com/bosphere/Android-FadingEdgeLayout)

## Getting Started

```
$ yarn add react-native-fading-edge
```

or

```
$ npm install --save react-native-fading-edge
```

#### Using React Native >= 0.60

Linking the package manually is not required anymore with [Autolinking](https://github.com/react-native-community/cli/blob/master/docs/autolinking.md).

#### Using React Native < 0.60

```
$ react-native link react-native-fading-edge
```

## Usage

```jsx
import React from 'react';
import { View, Text } from 'react-native';
import FadingEdge from 'react-native-fading-edge';

const App = () => (
  <FadingEdge
    top={50}
    left={50}
    bottom={50}
    right={50}
  >
    <View style={{ flex: 1, backgroundColor: '#212121' }}>
      <Text>
      	Hello, World.
      </Text>
    </View>
  </FadingEdge>
)
```

## Props

```ts
// ViewProps: https://github.com/facebook/react-native-website/blob/master/docs/view.md#props
interface FadingEdgeProps extends ReactNative.ViewProps {
  top: number;
  left: number;
  bottom: number;
  right: number;
}
```

## Motivation

Firstly I use [react-native-linear-gradient](https://github.com/react-native-community/react-native-linear-gradient) and [react-native-masked-view](https://github.com/react-native-community/react-native-masked-view) to implement this effect: 

```jsx
import MaskedView from '@react-native-community/masked-view';
import LinearGradient from 'react-native-linear-gradient';

const FadingEdge = ({ children }) => (
  <MaskedView
    maskedElement={
      <LinearGradient
        colors={[
          'rgba(255, 255, 255,1)', 
          'rgba(255, 255, 255,0)'
        ]}
      >
    }
  >
    {children}
  </MaskedView>
);
```

But its performance was terrible and had rendering issues. Maybe they were not designed to do stuff like this.

So I found the [Android-FadingEdgeLayout](https://github.com/bosphere/Android-FadingEdgeLayout) and made this wrapper.

## Thanks

- [react-native-linear-gradient](https://github.com/react-native-community/react-native-linear-gradient) 
- [react-native-masked-view](https://github.com/react-native-community/react-native-masked-view)

## License

[MIT](LICENSE)

